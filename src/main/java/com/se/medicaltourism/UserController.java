package com.se.medicaltourism;


import com.se.medicaltourism.model.Country;
import com.se.medicaltourism.model.File;
import com.se.medicaltourism.model.Residence;
import com.se.medicaltourism.model.UserModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.se.medicaltourism.model.Package;
import com.se.medicaltourism.utils.SearchFilter;

public class UserController {
    UserModel user = new UserModel("Ali", "Mohammadi", Country.IRAN, "secretPassword");
    static private PackageCatalog pckg = new PackageCatalog();
    static public List<Package> getPackages(Map<String,String> filterMap) {
        SearchFilter sf = new SearchFilter(filterMap);
        return pckg.getRecords(sf);
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
