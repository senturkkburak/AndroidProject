package com.example.androidproject;

public class User {

    public String fullname,email;
    public Integer scoreClocks,scoreDigits,scoreDirections,scoreMonths,scoreMultiplication,scoreSeasons,scoreWeekdays;
    public User(){

    }
    public User(String fullname,String email){
        this.fullname = fullname;
        this.email = email;
        this.scoreClocks=0;
        this.scoreDigits=0;
        this.scoreDirections=0;
        this.scoreMonths=0;
        this.scoreMultiplication=0;
        this.scoreSeasons=0;
        this.scoreWeekdays=0;
    }
}
