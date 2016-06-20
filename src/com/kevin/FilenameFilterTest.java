package com.kevin;

import java.io.File;

/**
 * Created by kevin on 16-6-20.
 */
public class FilenameFilterTest {
    public static void main(String[] args) {
        File file = new File(".");
        String[] nameList = file.list((dir, name) -> name.endsWith(".java") || new File(name).isDirectory());
        for(String name : nameList){
            System.out.println(name);
        }
    }
}
