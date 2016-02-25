package com.bassanidevelopment.santiago.grouprequest.model;

/**
 * Created by santiago on 2/22/16.
 */
public class Votes {
    String userID;
    String choseOption;
    String FormID;

    public Votes(String userID, String choseOption,String FormID) {
        this.userID = userID;
        this.choseOption = choseOption;
        this.FormID = FormID;
    }

    public Votes (){}

    public String getUserID() { return userID; }

    public String getChoseOption() {
        return choseOption;
    }

    // the form id is for the user upload
    public  String getFormID() { return FormID;}

    /*
    * The votes will work as follow:
    *
    *   votes|
    *        |-userID: Chose option
    * */


}
