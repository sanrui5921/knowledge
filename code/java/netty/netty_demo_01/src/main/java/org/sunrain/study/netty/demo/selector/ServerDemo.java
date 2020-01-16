package org.sunrain.study.netty.demo.selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class ServerDemo {

    private static Selector selector;

    private static ServerSocketChannel serverChannel;

    private static int num = 0;

    public static void main(String[] args) throws IOException {

        selector = Selector.open();
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress("127.0.0.1", 8081));
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("服务器在端口[" + 8081 + "]等待客户请求......");

        while (true) {
            selector.select(1000);
            System.out.println("while out");
            Set<SelectionKey> keySet = selector.selectedKeys();
            Iterator<SelectionKey> iterator = keySet.iterator();
            while (iterator.hasNext()) {
                System.out.println("while in");
                SelectionKey key = iterator.next();
                iterator.remove();
                handleInput(key);
            }
        }
    }

    private static void handleInput(SelectionKey key) throws IOException {
        //判断key有效才处理
        if (key.isValid()) {
            // 处理新接入的请求消息
            if (key.isAcceptable()) {
                ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
                SocketChannel socketChannel = ssc.accept(); // Non blocking, never null
                socketChannel.configureBlocking(false);
                SelectionKey sk = socketChannel.register(selector, SelectionKey.OP_READ);
                sk.attach(num++);
            }
            if (key.isReadable()) {
                // 读取数据
                SocketChannel sc = (SocketChannel) key.channel();
                ByteBuffer readBuffer = ByteBuffer.allocate(1024);
                int readBytes = sc.read(readBuffer);
                if (readBytes > 0) {
                    readBuffer.flip();
                    byte[] bytes = new byte[readBuffer.remaining()];
                    readBuffer.get(bytes);
                    String body = new String(bytes, "UTF-8");
                    System.out.println("来自客户端[" + key.attachment() + "]的输入： [" + body.trim() + "]！");

                    if (body.trim().equals("Quit")) {
                        System.out.println("关闭与客户端[" + key.attachment() + "]......");
                        key.cancel();
                        sc.close();
                    } else {
                        String response = "来自服务器端的响应：" + body;
                        doWrite(sc, response);
                    }

                } else if (readBytes < 0) {
                    // 对端链路关闭
                    key.cancel();
                    sc.close();
                } else {

                }
            }
        }
    }

    private static void doWrite(SocketChannel channel, String response) throws IOException {
        if (response != null && response.trim().length() > 0) {
            byte[] bytes = response.getBytes();
            ByteBuffer writeBuffer = ByteBuffer.allocate(bytes.length);
            writeBuffer.put(bytes);
            writeBuffer.flip();
            channel.write(writeBuffer);
        }
    }
}
