package com.se.medicaltourism.model;

import java.util.Map;

public class Package extends BaseModel {
    public static final String filePath = "src/test/resource/packages.csv";
    private String category;
    private String title;
    private String description;

    private String clininc_name;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Package(String category, String title, String description) {
        this.category = category;
        this.title = title;
        this.description = description;
    }

    public static Package makeFromMap(Map<String, String> map) {
        return new Package(map.get("category"), map.get("title"), map.get("description"));
    }

    @Override
    public String toString(){
        return this.title;
    }


}
