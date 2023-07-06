package com.se.medicaltourism.restapi;


import com.se.medicaltourism.model.*;
import com.se.medicaltourism.model.Package;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import com.se.medicaltourism.UserController;

@RestController
public class UserApi {

    @GetMapping("/getPackages")
    List<Package> getUser(@RequestParam() Map<String, String> filter) {
        return UserController.getPackages(filter);
    }

    @PutMapping("/selectPackage")
    public String selectPackage(@RequestBody Map<String, String> map) {
        UserController.submitPackage(Integer.parseInt(map.get("uid")));
        return "your package set to " + map.get("uid");
    }

    @GetMapping("/getResidences")
    List<Residence> getResidences(@RequestParam() Map<String, String> filter) {
        return UserController.getResidences(filter);
    }

    @PutMapping("/selectResidence")
    public String selectResidence(@RequestBody Map<String, String> map) {
        UserController.submitResidence(Integer.parseInt(map.get("uid")));
        return "your residente set to " + map.get("uid");
    }

    @PutMapping("/setVisaHelp")
    public String setVisaHelp(@RequestBody Map<String, String> map) {
        UserController.setVisaHelp(Boolean.parseBoolean(map.get("state")));
        return "your package set to " + map.get("state");
    }

    @GetMapping("/neededDocs")
    public List<Field> getNeededDocs(){
        return UserController.getRequiredDocs();
    }

    @PatchMapping("/modifyDocs")
    public void modifyDocs(@RequestBody List<Map<String,String>> map){
        var fields = Field.makeFromMap(map);
        UserController.modifyDocs(fields);
        System.out.println(fields);
    }
}
