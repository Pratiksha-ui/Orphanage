package com.example.fooddonate;

public class ClothHelperClass {

    String name1,phoneNo1,address1,MentionCloth1,QuantityCloth1;

    public ClothHelperClass() {
    }

    public ClothHelperClass(String name1, String phoneNo1, String address1, String mentionCloth1, String quantityCloth1) {
        this.name1 = name1;
        this.phoneNo1 = phoneNo1;
        this.address1 = address1;
        MentionCloth1 = mentionCloth1;
        QuantityCloth1 = quantityCloth1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getPhoneNo1() {
        return phoneNo1;
    }

    public void setPhoneNo1(String phoneNo1) {
        this.phoneNo1 = phoneNo1;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getMentionCloth1() {
        return MentionCloth1;
    }

    public void setMentionCloth1(String mentionCloth1) {
        MentionCloth1 = mentionCloth1;
    }

    public String getQuantityCloth1() {
        return QuantityCloth1;
    }

    public void setQuantityCloth1(String quantityCloth1) {
        QuantityCloth1 = quantityCloth1;
    }
}
