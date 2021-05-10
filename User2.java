package com.example.rishap.blooddonation;

/**
 * Created by RISHAP on 23-05-2018.
 */

public class User2 {

    private String name;
    private String address;
    private String bloodgroup;
    private String number;

    public User2() {
    }

    public User2(String name, String address, String bloodgroup, String number) {
        this.name = name;
        this.address = address;
        this.bloodgroup = bloodgroup;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
