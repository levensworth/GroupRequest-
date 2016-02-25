package com.bassanidevelopment.santiago.grouprequest.model;

import java.util.List;

/**
 * Created by santiago on 2/23/16.
 */
public class User {

    Long userID;
    String name;
    List<Form> activeForms;
    List<Votes> userVotes;

    public User() {
    }

    public User(Long userID, String name, List<Form> activeForms, List<Votes> userVotes) {
        this.userID = userID;
        this.name = name;
        this.activeForms = activeForms;
        this.userVotes = userVotes;
    }

    public Long getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public List<Form> getActiveForms() {
        return activeForms;
    }

    public List<Votes> getUserVotes() {
        return userVotes;
    }
}
