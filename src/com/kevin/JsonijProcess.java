package com.kevin;

import cc.plural.jsonij.JSON;
import cc.plural.jsonij.JSONMarshaler;
import cc.plural.jsonij.marshal.JSONMarshalerException;
import cc.plural.jsonij.parser.ParserException;

import java.io.*;
import java.lang.reflect.Field;

/**
 * Created by kevin on 16-6-20.
 */
public class JsonijProcess {
    public static void main(String[] args) throws IOException, JSONMarshalerException {
        Json jsonObj = new Json();

        System.out.println("Convert Java object to JSON format and save to file");

        try (FileWriter writer = new FileWriter("/home/kevin/code/java_study/jsonij.json")) {

            writer.write(JSONMarshaler.marshalObject(jsonObj).toJSON());

        } catch (IOException e) {

        }


        System.out.println("Read JSON from file, convert JSON string back to object");

        try (BufferedReader reader = new BufferedReader(new FileReader("/home/kevin/code/java_study/jsonij.json"))) {

            JSON json = JSON.parse(reader);



            // Now we need to parse the JSONObject object and put values back

            // to our Json object

            for (Field field : jsonObj.getClass().getDeclaredFields()) {

                try {

                    field.setAccessible(true);

                    field.set(field.getName(), json.get(field.getName()));

                } catch (IllegalArgumentException | IllegalAccessException e) {

                }

            }

        } catch (FileNotFoundException e) {

        } catch (IOException | ParserException e) {

        }
    }
}
