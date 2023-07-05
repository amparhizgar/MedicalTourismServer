package com.se.medicaltourism.restapi;


import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class UserApi {

    @GetMapping("/api/users/{username}")
    public String getUser(@PathVariable("username") String username) {
       return "this is your response " + username;
    }

    @PostMapping("/api/addCredit")
    public Map<String, String> addCredit(@RequestBody String body) {
       return Map.of("key1", "value1");
    }
}
