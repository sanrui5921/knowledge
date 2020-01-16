package org.sunrain.study.netty.demo.bio.multithread;


import org.sunrain.study.netty.demo.multithread.HostAndPort;
import org.sunrain.study.netty.demo.multithread.ServerHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * bio 多线程服务端1
 */
public class ServerDemo01 {

    public static void main(String[] args) throws IOException {
        ServerSocket server;
        System.out.println("服务器在端口[" + HostAndPort.PORT + "]等待客户请求......");
        int i = 0;
        server = new ServerSocket(HostAndPort.PORT);
        while (true) {
            Socket clientRequest = server.accept();
            new Thread(new ServerHandler(clientRequest, i++)).start();
        }
    }
}