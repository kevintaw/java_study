package com.kevin;

import net.sf.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by kevin on 16-6-20.
 */
public class JsonlibProcess {
    public static void main(String[] args) {
        Json jsonObj = new Json();
        JSONObject json;

        System.out.println("Convert Java object to JSON format and save to file");

        try(FileWriter writer = new FileWriter("/home/kevin/code/java_study/json-lib.json")) {
            json = JSONObject.fromObject(jsonObj);
            json.write(writer);
        } catch (IOException e) {

        }
    }
}
