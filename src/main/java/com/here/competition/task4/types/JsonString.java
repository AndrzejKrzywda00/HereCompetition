package com.here.competition.task4.types;

import com.here.competition.task4.JsonElement;
import com.here.competition.task4.JsonElementType;

public class JsonString extends JsonElement {
    private final String value;

    public JsonString(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public JsonElementType getType() {
        return JsonElementType.STRING;
    }
}
