package com.kevin;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by kevin on 16-6-21.
 */
public class RedirectIn {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("/home/kevin/code/java_study/src/com/kevin/RedirectIn.java")) {
            System.setIn(fis);
            Scanner sc = new Scanner(System.in);
            sc.useDelimiter("\n");
            while(sc.hasNext()) {
                System.out.println("键盘的输入内容是: " + sc.next());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
