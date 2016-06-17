package com.kevin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin on 16-6-17.
 */
public class JsonSecondObject {
    private int age = 83;
    private String name = "Clint Eastwood";
    private JsonThirdObject jsnTO = new JsonThirdObject();
    private List<String> messages;

    public JsonSecondObject() {
        this.messages = new ArrayList<String>() {
            {
                add("This is the AK-47 assault..");
                add("Are you feeling lucky..");
                add("When a naked man's chasing a..");
            }
        };
    }
}
