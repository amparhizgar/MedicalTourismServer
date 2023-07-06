package com.se.medicaltourism.model;

public class UserModel {
    private String name;
    private String family;
    private Country country;
    private String password;

    public UserModel(String name, String family, Country country, String password) {
        this.name = name;
        this.family = family;
        this.country = country;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPackageId() {
        return packageId;
    }

    public void submitPackage(int packageId) {
        this.packageId = packageId;
    }

    public int getResidenceId() {
        return residenceId;
    }

    public void submitResident(int residenceId) {
        this.residenceId = residenceId;
    }

    public boolean isVisaHelp() {
        return visaHelp;
    }

    public void setVisaHelp(boolean visaHelp) {
        this.visaHelp = visaHelp;
    }

    //requests data
    private int packageId,residenceId;
    private boolean visaHelp;

}
