package com.kevin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin on 16-6-17.
 */
public class Json {
    private int age = 52;
    private String name = "Jim Carrey";
    private JsonFirstObject jsnFO = new JsonFirstObject();
    private List<String> messages;

    public Json() {
        this.messages = new ArrayList<String>() {
            {
                add("Hey, maybe I will give you..");
                add("Excuse me, I'd like to..");
                add("Brain freeze. Alrighty Then I just..");
            }
        };
    }
}
