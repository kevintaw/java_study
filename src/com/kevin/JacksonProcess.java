package com.kevin;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by kevin on 16-6-20.
 */
public class JacksonProcess {

    public static void main(String[] args) throws Exception {
        Json jsonObj = new Json();
        ObjectMapper mapper = new ObjectMapper();

        System.out.println("Convert Java object to JSON format and save to file");
        try{
            mapper.writeValue(new File("/home/kevin/code/java_study/jackson.json"), jsonObj);
        } catch (JsonGenerationException e) {
        } catch (JsonMappingException e) {
        } catch (IOException e){
        }

        System.out.println("Read JSON from file, convert JSON back to object");

        try {

            jsonObj = mapper.readValue(new File("/home/kevin/code/java_study/jackson.json"), Json.class);

        } catch (JsonGenerationException e) {

        } catch (JsonMappingException e) {

        } catch (IOException e) {

        }
    }

}
