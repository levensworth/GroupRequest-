package com.bassanidevelopment.santiago.grouprequest.model;

/**
 * Created by santiago on 2/22/16.
 */
public class Votes {
    Long userID;
    String choseOption;

    public Votes(Long userID, String choseOption) {
        this.userID = userID;
        this.choseOption = choseOption;
    }

    public Votes (){}

    public Long getUserID() {
        return userID;
    }

    public String getChoseOption() {
        return choseOption;
    }


}
