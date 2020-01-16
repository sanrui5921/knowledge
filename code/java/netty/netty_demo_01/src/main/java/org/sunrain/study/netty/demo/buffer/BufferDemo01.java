package org.sunrain.study.netty.demo.buffer;

import java.nio.ByteBuffer;

public class BufferDemo01 {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(5);
        System.out.println("******空状态下的Buffer*****");
        System.out.println(buffer);
        System.out.println("*************************");
        buffer.put((byte) 'a').put((byte) 'b').put((byte) 'c').put((byte) 'd');
        System.out.println("******写入数据后*****");
        System.out.println(buffer);
        System.out.println("*************************");
//        System.out.println("******写入数据后*****");
//        buffer.put((byte) 'e').put((byte)'f');
//        System.out.println("*************************");
        System.out.println("******转换模式后*****");
        buffer.flip();
        System.out.println(buffer);
        System.out.println("*************************");
        System.out.println("buffer array: " + buffer.array());
        System.out.println("******读取后*****");
        buffer.get();
        buffer.get();
        System.out.println(buffer);
        System.out.println("*************************");
    }
}
