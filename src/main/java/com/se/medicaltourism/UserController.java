package com.se.medicaltourism;

import app.model.Country;
import app.model.File;
import app.model.Residence;
import app.model.UserModel;

import java.util.List;

public class UserController {
    UserModel user = new UserModel("Ali", "Mohammadi", Country.IRAN, "secretPassword");

    public List<Package> getPackages() {
        throw new RuntimeException("Not implemented yet");
    }

    public void submitPackage(Package p) {
        throw new RuntimeException("Not implemented yet");
    }

    public List<Residence> getResidences(int filter) {
        throw new RuntimeException("Not implemented yet");
    }

    public void submitResidence(Residence residence) {
        throw new RuntimeException("Not implemented yet");
    }

    public void setVisaHelp(boolean help) {

    }

    public File[] getRequiredDocs() {
        throw new RuntimeException("Not implemented yet");
    }

    public void modifyDoc(long id, File doc) {
        throw new RuntimeException("Not implemented yet");
    }

    public void fieldsDone() {
        throw new RuntimeException("Not implemented yet");
    }
}
