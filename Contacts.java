package com.keynote.newkey.keynote;



/**
 * Created by Acer on 4/28/2018.
 */

public class Contacts {
    int _id;
    String wordName;
    String mean;
    String date;
    public Contacts(){

    }
    public Contacts(int id, String wordName , String mean, String date){
        this._id = id;
        this.wordName = wordName;
        this.mean=mean;
        this.date = date;
    }

    public int getID(){
        return this._id;
    }
    public void setID(int id){
        this._id = id;
    }

    public String getWordName(){
        return this.wordName;
    }
    public void setWordName(String wordName){
        this.wordName = wordName;
    }

    public String getMean(){
        return this.mean;
    }
    public void setMean(String mean){
        this.mean = mean;
    }

    public String getDate(){
        return this.date;
    }
    public void setDate(String date){
        this.date = date;
    }

}
