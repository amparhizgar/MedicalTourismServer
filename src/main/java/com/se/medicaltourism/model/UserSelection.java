package com.se.medicaltourism.model;

public class UserSelection {
    @Override
    public String toString() {
        return "UserSelection{" +
                "visaHelp=" + visaHelp +
                ", packageId=" + packageId +
                ", residenceId=" + residenceId +
                '}';
    }

    public UserSelection(boolean visaHelp, int packageId, int residenceId) {
        this.visaHelp = visaHelp;
        this.packageId = packageId;
        this.residenceId = residenceId;
    }

    public boolean getVisaHelp() {
        return visaHelp;
    }

    public void setVisaHelp(boolean visaHelp) {
        this.visaHelp = visaHelp;
    }

    boolean visaHelp;

    int packageId, residenceId;
}
