package com.kevin;

import java.util.Date;

/**
 * Created by kevin on 16-6-23.
 */
public class DataTest {
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date(System.currentTimeMillis() + 100);

        System.out.println(d2);
        System.out.println(d1.compareTo(d2));
        System.out.println(d1.before(d2));
    }
}
