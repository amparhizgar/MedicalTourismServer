package com.se.medicaltourism;

import java.util.logging.Logger;

public class PrimaryRequestWorkflow {
    static public int lastId=1000;
    static public int addPrimaryRequest(String username){
        System.out.println("new primary request added for user "+username);
        lastId += 1;
        return lastId;
    }
}
