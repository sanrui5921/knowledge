# 硬件

1. CPU Intel(R) Xeon(R) CPU E5-2690 v4
2. 显卡 RTX2080Ti 虚拟机 (显卡需要UEFI 支持) 新显卡都支持,可以在[这里查询](https://www.techpowerup.com/vgabios/)

# 软件

1. CentOS7.7 1908.iso
2. KVM套件
3. qemu-kvm 需要2.9.0 以上版本
4. Win10

# 配置流程

1. 检查硬件是否满足要求
2. 准备系统环境 安装KVM 套件
3. 检查是否正确加载kvm模块
4. 开启IOMMU 支持
5. 设置 vfio-pci 设备 (IOMMU)
6. 更新qemu-kvm 到2.9.0以上版本
7. 安装OVMF
8. 安装虚拟机
9. 解决显卡 43错误代码



## 1. 检查硬件是否满足要求

​	验证CPU是否支持KVM；如果结果中有vmx（Intel VT虚拟化技术）或svm (SVM安全虚拟化技术的AMD处理器，也可以叫AMD-V )字样，就说明CPU的支持的。如果没有配置可以在BIOS中进行配置。如果没有任何的输出，说明你的cpu不支持，将无法使用KVM虚拟机

​	grep -oE 'svm|vmx' /proc/cpuinfo |uniq

​    如果是Intel的CPU则返回vmx，AMD的CPU则返回svm代表透传开关开启，如果没有正确返回以上数值，请重启服务器到BIOS里面进行相关的设置



## 2. 准备系统环境 安装KVM 套件

```
yum install net-tools vim wget kernel-devel virt-manager qemu-img qemu-kvm qemu-kvm-tools libvirt virt-install bridge-utils -y
```

## kvm相关安装包及其作用

```
qemu-kvm          主要的KVM程序包
python-virtinst   创建虚拟机所需要的命令行工具和程序库
virt-manager      GUI虚拟机管理工具
virt-top          虚拟机统计命令
virt-viewer       GUI连接程序，连接到已配置好的虚拟机
libvirt           C语言工具包，提供libvirt服务
libvirt-client    虚拟客户机提供的C语言工具包
virt-install      基于libvirt服务的虚拟机创建命令
bridge-utils      创建和管理桥接设备的工具
```

## 3.检查是否正确加载kvm模块

一共会输出三条,三条都必须满足.

```
[~]# lsmod |grep kvm
kvm_intel             170181  3
kvm                   554609  1 kvm_intel
irqbypass              13503  1 kvm
```

## 4. 开启IOMMU 支持

1.配置

```
vim /etc/default/grub

GRUB_CMDLINE_LINUX_DEFAULT="... intel_iommu=on ..."
或
GRUB_CMDLINE_LINUX="... intel_iommu=on ..."
```

2.更新

```
grub2-mkconfig -o /boot/grub2/grub.cfg
```

3.重启

```
reboot
```

4. 验证

```
dmesg | grep -E "DMAR|IOMMU"
```

![image-20200320171324599](/Users/qichao/knowledge/blogs/CloudGaming/image-20200320171324599.png)

## 4.禁用nouveau 驱动

```
vim /usr/lib/modprobe.d/dist-blacklist.conf

#在文件最后加上
blacklist nouveau
options nouveau modeset=0 

#备份镜像
mv /boot/initramfs-$(uname -r).img /boot/initramfs-$(uname -r).img.bak
#重建镜像
dracut -v /boot/initramfs-$(uname -r).img $(uname -r)

reboot
#重启之后检查是否禁用成功,应该返回空
lsmod | grep nouveau
```

## 5.设置 vfio-pci 设备 (IOMMU)

1.给VFIO-PCI 添加内核模块.

![image-20200320171534846](/Users/qichao/knowledge/blogs/CloudGaming/image-20200320171534846.png)

```
vim /etc/modprobe.d/vfio.conf
options vfio-pci ids=10de:1e04,10de:10f7,10de:1ad6,10de:1ad7

echo 'vfio-pci' > /etc/modules-load.d/vfio-pci.conf
reboot
```

2.验证

```
dmesg | grep -i vfio
```

![image-20200320171659859](/Users/qichao/knowledge/blogs/CloudGaming/image-20200320171659859.png)

## 6. 更新qemu-kvm 到2.9.0以上版本

```
[root@~]# /usr/libexec/qemu-kvm -version 
QEMU emulator version 1.5.3 (qemu-kvm-1.5.3-141.el7_4.6), Copyright (c) 2003-2008 Fabrice Bellard

[root@~]# yum -y install centos-release-qemu-ev

# disable usually
[root@~]# sed -i -e "s/enabled=1/enabled=0/g" /etc/yum.repos.d/CentOS-QEMU-EV.repo

# for this installing, [qemu-kvm] package is replaced to [qemu-kvm-ev] package
[root@~]# yum --enablerepo=centos-qemu-ev -y install qemu-kvm-ev

[root@~]# systemctl restart libvirtd

[root@~]# /usr/libexec/qemu-kvm -version 
QEMU emulator version 2.9.0(qemu-kvm-ev-2.9.0-16.el7_4.13.1)
Copyright (c) 2003-2017 Fabrice Bellard and the QEMU Project developers
```

## 7.安装OVMF

一.配置firmware源

​    wget http://www.kraxel.org/repos/firmware.repo -O /etc/yum.repos.d/firmware.repo

二.安装ovmf

​    yum install edk2.git-ovmf-x64
​    yum install OVMF #uefi的virt-manger图形组件
三.配置 libvirtd以启用UEFI

vim /etc/libvirt/qemu.conf

nvram = [

```
"/usr/share/edk2.git/ovmf-x64/OVMF_CODE-pure-efi.fd:/usr/share/edk2.git/ovmf-x64/OVMF_VARS-pure-efi.fd",
```

]

四.重启libvirtd

systemctl restart libvirtd

## 8.安装虚拟机

```
virt-install --virt-type kvm \
--name  Win1001 \
--ram 32744  \
--vcpus=8 \
--os-type=windows \
--os-variant=win10 \
--cdrom /home/cloudgaming/os/Win10.iso \
--disk path=/home/cloudgaming/vms/Win1001.qcow2,format=qcow2,size=100 \
--network network=default \
--graphics vnc,listen=0.0.0.0,port=8881,password=123qwe,keymap=en-us \ --video vga \
--features kvm_hidden=on \ --host-device 04:00.0 \ --host-device 04:00.1 \ --host-device 04:00.2 \ --host-device 04:00.3
```

## 9.解决显卡 43错误代码

可通过Virt-Manager图形界面化安装，也可以通过virt-install 命令行安装

```
#编辑VM XML
virsh edit win 

#修改第一行
<domain type='kvm'>
#为
<domain type='kvm' xmlns:qemu='http://libvirt.org/schemas/domain/qemu/1.0'>

#找到<features>节点，添加内容
<features>
... 
  <kvm>
    <hidden state='on'/>
  </kvm>
...
</features>

#找到</device>节点，在device后添加内容
<qemu:commandline>
  <qemu:arg value='-cpu'/>
  <qemu:arg value='host,hv_time,kvm=off,hv_vendor_id=null'/>
</qemu:commandline>
```



# 注意事项

## 1. nouveau 驱动

在创建虚机之前，如果没有禁用nouveau，系统会出core

## 2. vfio-pci: probe of 0000:04:00.0 failed with error -22

原因，IMMOU未开启

## 3. smm is not available with this QEMU binary

qemu-kvm未升级到2.9以上





# 暂未解问题

## 1. 虚机里的NVIDIA显示设置不可用

![image-20200320173513254](/Users/qichao/knowledge/blogs/CloudGaming/image-20200320173513254.png)

# 参考

https://blog.acesheep.com/index.php/archives/720/

https://www.jianshu.com/p/8074abc26b88

https://www.jianshu.com/p/ffc37624e5ae

https://blog.51cto.com/13810716/2440319