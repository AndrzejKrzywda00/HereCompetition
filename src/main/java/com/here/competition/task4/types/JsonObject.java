package com.here.competition.task4.types;

import com.here.competition.task4.JsonElement;
import com.here.competition.task4.JsonElementType;

import java.util.LinkedHashMap;
import java.util.Map;

public class JsonObject extends JsonElement {
    private final Map<String, JsonElement> properties = new LinkedHashMap<>();

    public Map<String, JsonElement> getProperties() {
        return properties;
    }

    public void addProperty(String name, JsonElement value) {
        properties.put(name, value);
    }

    public JsonElement getProperty(String name) {
        return properties.get(name);
    }

    @Override
    public JsonElementType getType() {
        return JsonElementType.OBJECT;
    }
}
