package com.ks_xlm.Common;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


public class JsonUtil {

    public static ObjectMapper objectMapper = new ObjectMapper();

    public static String convertObjectToString(Object o){
        String json = "";
        try {
            json = objectMapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }

    public static JsonNode getJsonNodeByContent(String content){
        try {
            return objectMapper.readTree(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
