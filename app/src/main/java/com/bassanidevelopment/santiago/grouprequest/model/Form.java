package com.bassanidevelopment.santiago.grouprequest.model;

import java.util.List;

/**
 * Created by santiago on 2/22/16.
 */
public class Form {
    String title;
    List<String> options;
    List<Votes> votes;
    List<User> activeUsers;

    public Form (){}

    public Form (String title){
        this.title = title;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public void setVotes(List<Votes> votes) {
        this.votes = votes;
    }

    public void setActiveUsers(List<User> activeUsers) {
        this.activeUsers = activeUsers;
    }

    public String getTitle() {

        return title;
    }

    public List<String> getOptions() {
        return options;
    }

    public List<Votes> getVotes() {
        return votes;
    }

    public List<User> getActiveUsers() {
        return activeUsers;
    }
}
