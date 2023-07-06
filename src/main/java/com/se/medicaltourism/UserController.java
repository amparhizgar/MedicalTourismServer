package com.se.medicaltourism;


import com.se.medicaltourism.model.Country;
import com.se.medicaltourism.model.File;
import com.se.medicaltourism.model.Residence;
import com.se.medicaltourism.model.UserModel;

import java.util.List;
import com.se.medicaltourism.model.Package;
public class UserController {
    UserModel user = new UserModel("Ali", "Mohammadi", Country.IRAN, "secretPassword");

    static public List<Package> getPackages() {
        PackageCatalog pckg = new PackageCatalog();
        return pckg.getRecords();
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
