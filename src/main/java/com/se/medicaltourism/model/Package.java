package com.se.medicaltourism.model;

import com.se.medicaltourism.utils.SearchFilter;

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

//    public Package(String category, String title, String description) {
//        this.category = category;
//        this.title = title;
//        this.description = description;
//    }

    public Package(Map<String,String> map) {
        super(map);
        this.category = map.get("category");
        this.title = map.get("title");
        this.description = map.get("description");
    }
    public static Package makeFromMap(Map<String, String> map)  {

        return new Package(map);
    }

    @Override
    public String toString(){
        return this.title;
    }

    @Override
    public boolean checkFilter(SearchFilter filter){
        boolean result = true;
        if (filter.data.containsKey("category")){
            result &= (filter.data.get("category").equals(category));
        }
        if (filter.data.containsKey("title")){
            result &= (filter.data.get("title").equals(title) );
        }
        if (filter.data.containsKey("description")){
            result &= (filter.data.get("description").equals(description));
        }
        if (filter.data.containsKey("clininc_name")){
            result &= (filter.data.get("clininc_name").equals(clininc_name));
        }

        return result & super.checkFilter(filter);
    }
}
