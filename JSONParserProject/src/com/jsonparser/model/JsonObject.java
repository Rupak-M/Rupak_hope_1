package com.jsonparser.model;

import java.util.HashMap;
import java.util.Map;

public class JsonObject {

    private Map<String, Object> data;

    public JsonObject() {
        data = new HashMap<>();
    }

    public void put(String key, Object value) {
        data.put(key, value);
    }

    @Override
    public String toString() {
        return data.toString();
    }
}