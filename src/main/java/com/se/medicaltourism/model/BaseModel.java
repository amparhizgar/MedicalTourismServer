package com.se.medicaltourism.model;

import com.se.medicaltourism.utils.SearchFilter;

import java.util.Map;

public class BaseModel {
    public static final String filePath = "set the csv file path";

    public int getUid() {
        return uid;
    }

    protected int uid = 0;
    public BaseModel(Map<String, String> map){
        uid = Integer.parseInt(map.get("uid"));
    }

    public static BaseModel makeFromMap(Map<String, String> map) {
        return null;
    }
    public boolean checkFilter(SearchFilter filter){
        boolean result = true;
        if (filter.data.containsKey("uid")){
            result &= filter.data.get("uid").equals(String.valueOf(uid));
        }
        return result;
    }
}
