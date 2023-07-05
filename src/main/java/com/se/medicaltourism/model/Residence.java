package com.se.medicaltourism.model;

public class Residence {
    private City city;
    private float stars;

    private String address;

    private String description;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
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

    public Residence(City city, float stars, String address, String description) {
        this.city = city;
        this.stars = stars;
        this.address = address;
        this.description = description;
    }

}
