package com.kevin;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by kevin on 16-6-21.
 */
public class AppendContent {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("out.txt", "rw")) {
            raf.seek(raf.length());
            raf.write("追加的内容!\n".getBytes());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
