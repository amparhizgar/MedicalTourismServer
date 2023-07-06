package com.se.medicaltourism.restapi;


import com.se.medicaltourism.model.Country;
import com.se.medicaltourism.model.UserModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import com.se.medicaltourism.UserController;
import com.se.medicaltourism.model.Package;

@RestController
public class UserApi {

    @GetMapping("/getPackages")
    List<Package> getUser(@RequestParam() Map<String, String> filter) {
        return UserController.getPackages();
    }

    @PostMapping("/selectPackage")
    public Map<String, String> addCredit(@RequestBody Map<String, String> map) {
       return Map.of("your id is", map.get("id"));
    }
}
