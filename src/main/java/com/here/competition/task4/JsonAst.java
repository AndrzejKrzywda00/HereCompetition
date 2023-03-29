package com.here.competition.task4;

public class JsonAst {
    public JsonElement parseJson(String jsonString) {
        return new JsonElement() {
            @Override
            public int hashCode() {
                return 1;
            }
        };
    }
}
