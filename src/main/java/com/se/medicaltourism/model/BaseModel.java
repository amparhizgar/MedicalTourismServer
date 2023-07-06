package com.se.medicaltourism.model;

import com.se.medicaltourism.utils.SearchFilter;

import java.util.Map;

public class BaseModel {
    public static final String filePath = "set the csv file path";

    public static BaseModel makeFromMap(Map<String, String> map) {
        return null;
    }
    public boolean checkFilter(SearchFilter filter){
        return true;
    }
}
