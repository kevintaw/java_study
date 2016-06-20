package com.kevin;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by kevin on 16-6-20.
 */
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/home/kevin/code/java_study/src/com/kevin/FileInputStreamTest.java");
        byte [] bbuf = new byte[1024];
        int hasRead = 0;

        while ((hasRead=fis.read(bbuf)) > 0) {
            System.out.print(new String(bbuf, 0, hasRead));
        }

        fis.close();
    }
}
