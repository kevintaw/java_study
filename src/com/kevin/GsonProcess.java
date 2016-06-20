package com.kevin;

import com.google.gson.Gson;

import java.io.*;

/**
 * Created by kevin on 16-6-20.
 */
public class GsonProcess {
    public static void main(String[] args) {
        Json jsonObj = new Json();
        Gson gson = new Gson();

        System.out.println("Convert Java object to JSON format and save to file");
        try(FileWriter writer = new FileWriter("/home/kevin/code/java_study/gson.json")) {
            writer.write(gson.toJson(jsonObj));
        } catch (IOException e){
        }

        System.out.println("Read JSON from file, convert JSON string back to object");
        try(BufferedReader reader = new BufferedReader(new FileReader("/home/kevin/code/java_study/gson.json"))){
            jsonObj = gson.fromJson(reader, Json.class);
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }
}
