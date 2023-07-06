package com.se.medicaltourism.utils;

import java.util.HashMap;

public class SearchFilter {
    public HashMap<String, String> data;
    public SearchFilter(HashMap<String, String> dataArg){
        data = new HashMap<String, String> (dataArg);
    }
}
