package com.se.medicaltourism.model;

import java.util.Map;

public class Package extends BaseModel {
    public static final String filePath = "test/resource/packages.csv";
    private String category;
    private String title;
    private String description;

    private String clininc_name;


    public Package(String category, String title, String description) {
        this.category = category;
        this.title = title;
        this.description = description;
    }

    public static Package makeFromMap(Map<String, String> map) {
        return new Package(map.get("category"), map.get("title"), map.get("description"));
    }
}
