package com.here.competition.task4.types;

import com.here.competition.task4.JsonElement;
import com.here.competition.task4.JsonElementType;

public class JsonBoolean extends JsonElement {
    private final boolean value;

    public JsonBoolean(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    public JsonElementType getType() {
        return JsonElementType.BOOLEAN;
    }
}
