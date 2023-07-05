package com.se.medicaltourism.restapi;


import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class UserApi {

    @GetMapping("/getPackages")
    public Map<String, String> getUser(@RequestParam() Map<String, String> filter) {
       return Map.of("response", filter.get("name"));
    }

    @PostMapping("/selectPackage")
    public Map<String, String> addCredit(@RequestBody Map<String, String> map) {
       return Map.of("your id is", map.get("id"));
    }
}
