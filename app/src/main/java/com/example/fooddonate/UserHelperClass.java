package com.example.fooddonate;

public class UserHelperClass {
    String name,phoneNo,Address,MentionFood,QuantityFood,Time;

    public UserHelperClass() {
    }

    public UserHelperClass(String name, String phoneNo, String address, String mentionFood, String quantityFood, String time) {
        this.name = name;
        this.phoneNo = phoneNo;
        Address = address;
        MentionFood = mentionFood;
        QuantityFood = quantityFood;
        Time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getMentionFood() {
        return MentionFood;
    }

    public void setMentionFood(String mentionFood) {
        MentionFood = mentionFood;
    }

    public String getQuantityFood() {
        return QuantityFood;
    }

    public void setQuantityFood(String quantityFood) {
        QuantityFood = quantityFood;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
}
