package com.kevin;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;

import java.io.*;

/**
 * Created by kevin on 16-6-20.
 */
public class FlexjsonProcess {
    public static void main(String[] args) {
        Json jsonObj = new Json();
        JSONSerializer serializer = new JSONSerializer();

        System.out.println("Convert Java object to JSON format and save to file");

        try(FileWriter writer = new FileWriter("/home/kevin/code/java_study/flexjson.json")) {
            serializer.deepSerialize(jsonObj, writer);
        } catch (IOException e) {
        }

        System.out.println("Read JSON from file, convert JSON string back to object");

        try(BufferedReader reader = new BufferedReader(new FileReader("/home/kevin/code/java_study/flexjson.json"))) {
            jsonObj = new JSONDeserializer<Json>().deserialize(reader);
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }
}
