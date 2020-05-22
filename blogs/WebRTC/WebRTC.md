# 1. 简介

​	WebRTC（Web Real-Time Communication——网页实时通信）是一个基于浏览器的实时多媒体通信技术。	

​	同时，通过将这些能力封装并以JavaScript API的方式开放给Web应用开发人员，使得Web应用开发人员能够通过HTML标签和JavaScript API快速地开发出基于Web浏览器的实时音视频应用，而无需依赖任何第三方插件

​	

​	总结: WebTRC设计最初是让浏览器支持实时通信能力，后封装JavascriptAPI，使得只需要HTML + Javascript即可实现实时音视频应用。

**通常WebRTC程序需要实现以下需求**

​	获得流音频，视频或其他数据。

​	获取网络信息，如IP地址和端口，与其他WebRTC客户端（称为节点）连接通讯、交换数据，穿越NAT和防火墙。

​	协调信令通信以报告错误、发起或关闭会话。

​	客户端之间交换媒体和客户的信息，如分辨率和编解码器。

​	通信流音频，视频或数据。

​	MediaStream API代表同步流媒体。例如，从摄像头和麦克风输入的流有同步的视频和音频曲目。（不要混淆mediastream轨道与<track>的元素，这是完全不同的东西。）



功能划分

1. 获取音频和视频数据
2. 传输音频和视频数据
3. 传输任意二进制数据

API划分:三个JS接口

1. MediaStream (又叫getUserMedia)
2. RTCPeerConnection (C++)
3. RTCDataChannel



### RTCPeerConnection

1. 信令处理
2. 编解码协商
3. 点对点传输
4. 通讯安全保护
5. 带宽管理（手机可以调得质量差点、PC可以质量高）
6. 。。。

（编码采用的最初不是采用的h264，而是VP8， 最新版本已经支持）



### **1. 媒体协商**

**彼此要了解对方支持的媒体格式**

![img](https://pic3.zhimg.com/80/v2-cb83376bef7a987902a422dd31983a06_1440w.jpg)

比如：Peer-A端可支持VP8、H264多种编码格式，而Peer-B端支持VP9、H264，要保证二端都正确的编解码，**最简单的办法就是取它们的交集H264**

注：**有一个专门的协议 ，称为Session Description Protocol (SDP)**，可用于描述上述这类信息，在WebRTC中，参与视频通讯的双方必须先交换SDP信息，这样双方才能知根知底，而交换SDP的过程，也称为"媒体协商"。