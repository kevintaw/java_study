package com.kevin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin on 16-6-17.
 */
public class JsonThirdObject {
    private int age = 81;
    private String name = "Michael Caine";
    private List<String> messages;

    public JsonThirdObject() {
        this.messages = new ArrayList<String>() {
            {
                add("You wouldn't hit a man with no trousers..");
                add("At this point, I'd set you up with a..");
                add("You know, your bobby dangler, giggle stick,..");
            }
        };
    }
}
