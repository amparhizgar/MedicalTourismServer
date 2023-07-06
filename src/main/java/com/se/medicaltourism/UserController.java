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
    static private UserModel user = new UserModel("Ali", "Mohammadi", Country.IRAN, "secretPassword");
    static private PackageCatalog pckg = new PackageCatalog();
    static private ResidenceCatalog reside = new ResidenceCatalog();
    static public List<Package> getPackages(Map<String,String> filterMap) {
        SearchFilter sf = new SearchFilter(filterMap);
        return pckg.getRecords(sf);
    }

    static public void submitPackage(int uid) {
        user.submitPackage(uid);
    }

    static public List<Residence> getResidences(Map<String,String> filterMap) {
        SearchFilter sf = new SearchFilter(filterMap);
        return reside.getRecords(sf);
    }

    static public void submitResidence(int uid) {
        user.submitResident(uid);
    }

    static public void setVisaHelp(boolean help) {
        user.setVisaHelp(help);
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
