package com.kevin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin on 16-6-17.
 */
public class JsonFirstObject {
    private int age = 76;
    private String name = "Morgan Freeman";
    private JsonSecondObject jsnSO = new JsonSecondObject();
    private List<String> messages;

    public JsonFirstObject() {
        this.messages = new ArrayList<String>() {
            {
                add("I once heard a wise man say..");
                add("Well, what is it today? More..");
                add("Bruce... I'm God. Circumstances have..");
            }
        };
    }
}
