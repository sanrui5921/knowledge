package org.sunrain.study.netty.demo.bio.singlethread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

    public static final int port = 8080;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("服务器在[" + port + "]端口监听");
        int i = 0;
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("客户端[" + i + "]连接进来");
            handleRequest(socket, i++);
        }
    }

    private static void handleRequest(Socket socket, int clientNo) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String inputLine;
        PrintStream os = new PrintStream(socket.getOutputStream());
        while ((inputLine = in.readLine()) != null) {
            if ("quit".equals(inputLine)) {
                System.out.println("关闭与客户端[" + clientNo + "]......" + clientNo);
                os.close();
                in.close();
                socket.close();
                break;
            } else {
                //打印接收到的客户端的消息，并原样返回客户端
                System.out.println("来自客户端[" + clientNo + "]的输入： " + inputLine);
                os.println("来自服务器端的响应：" + inputLine);
            }
        }
    }
}
