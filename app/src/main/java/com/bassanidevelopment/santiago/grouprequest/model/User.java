package com.bassanidevelopment.santiago.grouprequest.model;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by santiago on 2/23/16.
 */
public class User {

    String userID;
    String name;
    ArrayList<String> activeForms;
    ArrayList<String> userVotes;

    public User() {
    }

    public User(String userID, String name, ArrayList<String> activeForms, ArrayList<String> userVotes) {
        this.userID = userID;
        this.name = name;
        this.activeForms = activeForms;
        this.userVotes = userVotes;
    }

    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public List<String> getActiveForms() {
        return activeForms;
    }

    public List<String> getUserVotes() {
        return userVotes;
    }
}
