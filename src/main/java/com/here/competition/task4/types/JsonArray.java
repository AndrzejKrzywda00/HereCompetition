package com.here.competition.task4.types;

import com.here.competition.task4.JsonElement;
import com.here.competition.task4.JsonElementType;

import java.util.ArrayList;
import java.util.List;

public class JsonArray extends JsonElement {
    private final List<JsonElement> items = new ArrayList<>();

    public List<JsonElement> getItems() {
        return items;
    }

    public void addItem(JsonElement item) {
        items.add(item);
    }

    @Override
    public JsonElementType getType() {
        return JsonElementType.ARRAY;
    }
}
