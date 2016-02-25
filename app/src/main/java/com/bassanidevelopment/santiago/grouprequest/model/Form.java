package com.bassanidevelopment.santiago.grouprequest.model;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by santiago on 2/22/16.
 */
public class Form {
    String title;
    ArrayList<String> options;
    ArrayList<Votes> votes;
    ArrayList<String> activeUsers;

    public Form (){}

    public Form (String title, ArrayList<String> activeUsers){
        this.title = title;
        this.activeUsers = activeUsers;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public void setVotes(ArrayList<Votes> votes) {
        this.votes = votes;
    }

    public void setActiveUsers(ArrayList<String> activeUsers) {
        this.activeUsers = activeUsers;
    }

    public String getTitle() { return title; }

    public ArrayList<String> getOptions() {
        return options;
    }

    public ArrayList<Votes> getVotes() {
        return votes;
    }

    public ArrayList<String> getActiveUsers() {
        return activeUsers;
    }

    public void  addOptions (String newOption){
        options.add(newOption);
    }



    /*
    * forms structure:
    *
    *   Forms:|
    *         |-push()|-title:"title"
      *       | create|-activeUsers:|-uid of user: UID
       *      |   a   |-options:|- optionName : "option"
        *     | UID   |-votes:|-userUID:voted option
    * */
}
