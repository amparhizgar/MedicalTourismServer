package com.se.medicaltourism.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

class UserStorageDao{
    static private String dir = "src/test/resource/userstorage";
    static private String getPath(String uname){
        return dir + "/" + uname + ".txt";
    }
//    static private List<Field> importDocs(String uname){
//        var path = getPath(uname);
//
//    }
    static public void modifyDocs(String uname, List<Field> newContents){
        var path = getPath(uname);
        var newText = newContents.toString();
        File file = new File(path);
        try {

            // create new BufferedWriter for the output file
            var bf = new BufferedWriter(new FileWriter(file));

            // iterate map entries
            for (var entry : newContents) {

                // put key and value separated by a colon
                bf.write(entry.getName() + ":"+ entry.getContent());
                // new line
                bf.newLine();
            }

            bf.flush();
            bf.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class UserStorage{
    public UserStorage(String userName) {
        this.userName = userName;
    }

    private String userName;
    public void modifyDocs(List<Field> newContents){
        UserStorageDao.modifyDocs(userName, newContents);
    }
}
public class UserModel {
    private String name;
    private String family;
    private Country country;
    private String password;
    private UserStorage storage;
    public UserModel(String name, String family, Country country, String password) {
        this.name = name;
        this.family = family;
        this.country = country;
        this.password = password;
        storage = new UserStorage(name);
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

    public UserSelection getSelection(){
        return new UserSelection(visaHelp, packageId, residenceId);
    }

    public void modifyDocs(List<Field> fields){
        storage.modifyDocs(fields);
    }
}
