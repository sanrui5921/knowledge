package org.sunrain.study.netty.demo.channel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo {
    public static void main(String[] args) throws IOException {
        String fromFile = "/Users/qichao/id_rsa";
        String toFile = "/Users/qichao/id_rsa.bak";
        FileInputStream inputStream = new FileInputStream(fromFile);
        FileChannel inChannel = inputStream.getChannel();

        FileOutputStream outputStream = new FileOutputStream(toFile);
        FileChannel toChannel = outputStream.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        while (true) {
            buffer.clear();
            int r = inChannel.read(buffer);
            if (r == -1) {
                break;
            }
            buffer.flip();
            toChannel.write(buffer);
        }
    }
}
