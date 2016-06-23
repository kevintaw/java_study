package com.kevin;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by kevin on 16-6-21.
 */
public class WriteToProcess {
    public static void main(String[] args) throws IOException {
        Process p = Runtime.getRuntime().exec("java /home/kevin/code/java_study/src/com/kevin/WriteToProcess.java/ReadStandard");
        try (PrintStream ps = new PrintStream(p.getOutputStream())) {
            ps.println("普通字符串");
            ps.println(new WriteToProcess());
        }
    }
}


class ReadStandard {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
             PrintStream ps = new PrintStream(new FileOutputStream("output.txt"))) {
            sc.useDelimiter("\n");
            while (sc.hasNext()) {
                ps.println("键盘输入的内容是: " + sc.next());
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
