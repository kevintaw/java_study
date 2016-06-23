package com.kevin;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by kevin on 16-6-21.
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("/home/kevin/code/java_study/src/com/kevin/RandomAccessFileTest.java", "r")) {
            System.out.println("RandomAccessFileTest的文件指针的初始位置: " + raf.getFilePointer());
            raf.seek(300);

            byte[] bbuf = new byte[1024];
            int hasRead = 0;

            while ((hasRead = raf.read(bbuf)) > 0) {
                System.out.println(new String(bbuf, 0, hasRead));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
