package com.here.competition.task4.types;

import com.here.competition.task4.JsonElement;
import com.here.competition.task4.JsonElementType;

public class JsonNumber extends JsonElement {
    private final Number value;

    public JsonNumber(Number value) {
        this.value = value;
    }

    public Number getValue() {
        return value;
    }

    @Override
    public JsonElementType getType() {
        return JsonElementType.NUMBER;
    }
}
