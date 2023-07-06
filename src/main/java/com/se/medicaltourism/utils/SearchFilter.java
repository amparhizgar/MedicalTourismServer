package com.se.medicaltourism.utils;

import java.util.HashMap;
import java.util.Map;

public class SearchFilter {
    public HashMap<String, String> data;
    public SearchFilter(Map<String, String> dataArg){
        data = new HashMap<String, String> (dataArg);
    }
}
