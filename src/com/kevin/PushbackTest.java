package com.kevin;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

/**
 * Created by kevin on 16-6-20.
 */
public class PushbackTest {
    public static void main(String[] args) {
        try(PushbackReader pr = new PushbackReader(new FileReader("/home/kevin/code/java_study/src/com/kevin/PushbackTest.java"), 64)){
            char[] buf = new char[32];
            String lastContent = "";
            int hasRead = 0;
            while((hasRead = pr.read(buf)) > 0) {
                String content = new String(buf, 0, hasRead);
                int targetIndex = 0;

                if((targetIndex = (lastContent + content).indexOf("new PushbackReader")) > 0) {
                    pr.unread((lastContent + content).toCharArray());
                    if(targetIndex > 32) {
                        buf = new char[targetIndex];
                    }
                    pr.read(buf, 0, targetIndex);
                    System.out.print(new String(buf, 0, targetIndex));
                    System.exit(0);
                }
                else{
                    System.out.print(lastContent);
                    lastContent = content;
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}