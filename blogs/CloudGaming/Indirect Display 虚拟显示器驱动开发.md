# Indirect Display 虚拟显示器驱动开发

https://blog.csdn.net/fanxiushu/article/details/93524220



##### 什么是UMDF驱动？

Indirect Display 驱动属于 UMDF驱动  *什么是UMDF驱动？*



##### *WDDM HOOK中是什么*

微软在内核专门提供了 IndirectKmd.sys 驱动来挂钩到每个显卡驱动，
就相当于给每个显卡驱动增加了真正的过滤驱动来完成类似我们在WDDM HOOK中实现的功能  



Indirect Display Driver 内部实现的核心原理 -> 微软在IndirectKmd.sys内核中实现通用的拦截处理功能，然后提供 应用层的Indirect Display框架，留给我们实现具体的虚拟显示器



##### PDO是什么

在内核中模拟出一个PDO物理设备对象来，把Indirect Display 挂载到这个PDO上即可



每个 Indirect Display 都必须有一个唯一的 IDDCX_ADAPTER对象，用于描述这个显卡 adapter，
而IDDCX_ADAPTER 可以包含 0个或者多个 IDDCX_MONITOR 对象。
这个IDDCX_MONITOR对象就是用来描述这个Indirect Display可以模拟出多少个 显示器。
每个 IDDCX_MONITOR对象 都会包含 一个 IDDCX_SWAPCHAIN对象，
这个IDDCX_SWAPCHAIN对象就是用来从每个Monitor截取桌面图像数据使用的



Indirect Display 1 -> 1  IDDCX_ADAPTER

IDDCX_ADAPTER 0 -> n IDDCX_MONITOR

IDDCX_MONITOR 1 -> 1 IDDCX_SWAPCHAIN 



IDDCX_ADAPTER: 描述显卡 adapter 

IDDCX_MONITOR: 描述这个Indirect Display可以模拟出多少个显示器

IDDCX_SWAPCHAIN: 用来从每个Monitor截取桌面图像数据使用的



 Indirect Display的开发流程

在UMDF初始化的时候，配置相关参数，然后创建 IDDCX_ADAPTER对象，
然后就是根据我们的需求，模拟”插入“ 虚拟显示器。
每插入一个虚拟显示器，就等于是创建 一个IDDCX_MONITOR对象，
然后”拔掉“这个虚拟显示器，等于是销毁 IDDCX_MONITOR对象。
要从每个虚拟显示器获取到当前桌面的图像数据，
只要获取到IDDCX_MONITOR对象的 IDDCX_SWAPCHAIN对象，就能进一步获取到图像数据了



















