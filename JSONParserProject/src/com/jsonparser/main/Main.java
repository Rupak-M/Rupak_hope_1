package com.jsonparser.main;

import com.jsonparser.parser.SimpleJsonParser;
import com.jsonparser.model.JsonObject;

public class Main {

    public static void main(String[] args) {

        String json = "{ \"name\": \"Rupak\", \"age\": 21, \"city\": \"Chennai\" }";

        try {
            SimpleJsonParser parser = new SimpleJsonParser();
            JsonObject obj = parser.parse(json);

            System.out.println("Parsed JSON:");
            System.out.println(obj);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}