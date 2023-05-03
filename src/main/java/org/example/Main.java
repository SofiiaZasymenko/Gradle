package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        User user = new User("Sofiia", "Zasymenko");
        System.out.println(new Gson().toJson(user));
    }
}