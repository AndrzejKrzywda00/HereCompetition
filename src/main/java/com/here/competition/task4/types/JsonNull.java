package com.here.competition.task4.types;

import com.here.competition.task4.JsonElement;
import com.here.competition.task4.JsonElementType;

public class JsonNull extends JsonElement {
    public JsonElementType getType() {
        return JsonElementType.NULL;
    }
}
