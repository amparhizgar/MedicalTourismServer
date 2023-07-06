package com.se.medicaltourism;


import com.se.medicaltourism.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import com.se.medicaltourism.model.Package;
import com.se.medicaltourism.utils.SearchFilter;

public class UserController {
    static private UserModel user = new UserModel("Ali", "Mohammadi", Country.UAE, "secretPassword");
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

    static public List<Field> getRequiredDocs() {
        List<Field> visaFields = new ArrayList<>();
        UserSelection selection = user.getSelection();
        System.out.println(selection);
        if (selection.getVisaHelp()){
            visaFields = VisaController.getVisaFields(user.getCountry());
        }
        var packageFields = pckg.getPackageFields(user.getPackageId());
        List<Field> result = Stream.concat(visaFields.stream(), packageFields.stream()).toList();
        return result;
    }

    static public void modifyDocs(List<Field> fields) {
        user.modifyDocs(fields);
    }

    public void fieldsDone() {
        throw new RuntimeException("Not implemented yet");
    }
}
