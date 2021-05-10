package com.example.rishap.blooddonation;

/**
 * Created by RISHAP on 22-05-2018.
 */

public class User {

    private String Name;
    private String Bloodgroup;
    private String Number;
    private String Address;

    public User() {
    }

    public User(String name, String bloodgroup, String number, String address) {
        Name = name;
        Bloodgroup = bloodgroup;
        Number = number;
        Address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBloodgroup() {
        return Bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        Bloodgroup = bloodgroup;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
