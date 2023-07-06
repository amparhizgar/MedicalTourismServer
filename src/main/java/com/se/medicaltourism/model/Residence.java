package com.se.medicaltourism.model;

import com.se.medicaltourism.utils.SearchFilter;

import java.util.Map;

public class Residence extends BaseModel {
    public static final String filePath = "src/test/resource/residences.csv";

    private String city;

    private float stars;

    private String address;

    public String getName() {
        return name;
    }

    private String name;

    private String description;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Residence(Map<String, String> map) {
        super(map);
        this.city = map.get("city");
        this.stars = Float.parseFloat(map.get("stars"));
        this.address = map.get("address");
        this.description = map.get("description");
        this.name=  map.get("name");
    }

    public static Residence makeFromMap(Map<String, String> map)  {

        return new Residence(map);
    }

    @Override
    public boolean checkFilter(SearchFilter filter){
        boolean result = true;
        if (filter.data.containsKey("name")){
            result &= (filter.data.get("name").equals(name) );
        }
        if (filter.data.containsKey("description")){
            result &= (filter.data.get("description").equals(description));
        }

        if (filter.data.containsKey("stars")){
            result &= ( Float.parseFloat(filter.data.get("stars")) == (stars));
        }
        //name	city	description	address	stars

        if (filter.data.containsKey("city")){
            result &= (filter.data.get("city").equals(city));
        }

        return result & super.checkFilter(filter);
    }
}
