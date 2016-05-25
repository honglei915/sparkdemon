/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.leicui.sparkdemon;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("I'm a Lambda!");
        }).start();
        System.out.println("Hello World!");
    }
}
