package com.kevin;

import com.cedarsoftware.util.io.JsonReader;
import com.cedarsoftware.util.io.JsonWriter;
import com.sun.org.apache.xml.internal.security.transforms.TransformationException;

import java.io.*;

/**
 * Created by kevin on 16-6-20.
 */
public class JsonioProcess {
    public static void main(String[] args) {
        Json jsonObj = new Json();
        System.out.println("Convert Java object to JSON format and save to file");

        try(JsonWriter writer = new JsonWriter(new FileOutputStream("/home/kevin/code/java_study/jsonio.json"))) {
            writer.write(jsonObj);
        } catch (IOException e) {
        }

        System.out.println("Read JSON from file, convert JSON string back to object");

        try(JsonReader reader = new JsonReader(new FileInputStream(new File("/home/kevin/code/java_study/jsonio.json")))) {
            jsonObj = (Json) reader.readObject();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }
}
