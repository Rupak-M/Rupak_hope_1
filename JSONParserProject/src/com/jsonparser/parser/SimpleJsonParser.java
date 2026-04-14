package com.jsonparser.parser;

import com.jsonparser.model.JsonObject;
import com.jsonparser.exception.JsonParseException;

public class SimpleJsonParser {

    public JsonObject parse(String json) throws JsonParseException {

        if (json == null || json.trim().isEmpty()) {
            throw new JsonParseException("Empty JSON");
        }

        json = json.trim();

        if (!json.startsWith("{") || !json.endsWith("}")) {
            throw new JsonParseException("Invalid JSON format");
        }

        json = json.substring(1, json.length() - 1); // remove { }

        JsonObject obj = new JsonObject();

        String[] pairs = json.split(",");

        for (String pair : pairs) {

            String[] kv = pair.split(":");

            if (kv.length != 2) {
                throw new JsonParseException("Invalid key-value pair");
            }

            String key = clean(kv[0]);
            String value = clean(kv[1]);

            // check if number
            if (value.matches("\\d+")) {
                obj.put(key, Integer.parseInt(value));
            } else {
                obj.put(key, value);
            }
        }

        return obj;
    }

    private String clean(String str) {
        return str.trim().replace("\"", "");
    }
}