package com.kevin;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by kevin on 16-6-20.
 */
public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("/home/kevin/code/java_study/src/com/kevin/FileReaderTest.java")) {
            char[] cbuf = new char[32];
            int hasRead = 0;
            while ((hasRead = fr.read(cbuf)) > 0) {
                System.out.print(new String(cbuf, 0, hasRead));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
