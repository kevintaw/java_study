package com.kevin;

import java.util.Objects;

/**
 * Created by kevin on 16-6-23.
 */
public class ObjectsTest {
    static ObjectsTest obj;
    public static void main(String[] args) {
        System.out.println(Objects.hashCode(obj));
        System.out.println(Objects.toString(obj));
        System.out.println(Objects.requireNonNull(obj));
    }
}
