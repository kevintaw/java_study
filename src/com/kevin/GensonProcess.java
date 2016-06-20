package com.kevin;

import com.owlike.genson.Genson;
import com.sun.org.apache.xml.internal.security.transforms.TransformationException;

import java.io.*;

/**
 * Created by kevin on 16-6-20.
 */
public class GensonProcess {
    public static void main(String[] args) throws Exception{
        Json jsonObj = new Json();
        Genson genson = new Genson();

        System.out.println("Convert Java object to JSON format and save to file");
        try(FileWriter writer = new FileWriter("/home/kevin/code/java_study/genson.json")) {
            writer.write(genson.serialize(jsonObj));
        } catch (IOException e) {
        }

        System.out.println("Read JSON from file, convert JSON string back to object");

        try (BufferedReader reader = new BufferedReader(new FileReader("/home/kevin/code/java_study/genson.json"))) {

            jsonObj = genson.deserialize(reader, Json.class);

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }
}
