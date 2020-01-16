package org.sunrain.study.netty.demo.bio.singlethread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientDemo {

    public static final int port = 8080;

    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1", port);
        PrintWriter out;
        BufferedReader in;
        out = new PrintWriter(client.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        System.out.println("连接到服务器......");
        System.out.println("请输入消息[输入\"quit\"退出]：");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userInput;

        while ((userInput = reader.readLine()) != null) {
            out.println(userInput);
            System.out.println(in.readLine());

            if ("quit".equals(userInput)) {
                System.out.println("关闭客户端......");
                out.close();
                in.close();
                reader.close();
                client.close();
                System.exit(1);
            }
            System.out.println("请输入消息[输入\"quit\"退出]：");
        }
    }
}
