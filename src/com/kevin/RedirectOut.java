package com.kevin;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by kevin on 16-6-21.
 */
public class RedirectOut {
    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("out.txt"))) {
            System.setOut(ps);
            System.out.println("普通字符串");
            System.out.println(new RedirectOut());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
