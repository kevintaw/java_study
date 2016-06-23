package com.kevin;

import java.io.*;

/**
 * 插入的内容
 * 插入的内容
 * 插入的内容
 * Created by kevin on 16-6-21.
 */
public class InsertContent {

    public static void insert(String fileName, long pos, String insertContent) throws IOException {
        File tmp = File.createTempFile("tmp", null);
        tmp.deleteOnExit();
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
             FileOutputStream tmpOut = new FileOutputStream(tmp);
             FileInputStream tmpIn = new FileInputStream(tmp)) {
            raf.seek(pos);

            byte[] bbuf = new byte[64];
            int hasRead = 0;

            while ((hasRead = raf.read(bbuf)) > 0) {
                tmpOut.write(bbuf, 0, hasRead);
            }

            raf.seek(pos);
            raf.write(insertContent.getBytes());

            while ((hasRead = tmpIn.read(bbuf)) > 0) {
                raf.write(bbuf, 0, hasRead);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        insert("/home/kevin/code/java_study/src/com/kevin/InsertContent.java", 45, "插入的内容\n");
    }
}
