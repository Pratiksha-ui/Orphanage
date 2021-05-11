package com.example.fooddonate;

public class Volunteering {
    String VolName,VolPhone,event,Reason,experience;
    public Volunteering() {
    }

    public Volunteering(String volName, String volPhone, String event, String reason, String experience) {
        VolName = volName;
        VolPhone = volPhone;
        this.event = event;
        Reason = reason;
        this.experience = experience;
    }

    public String getVolName() {
        return VolName;
    }

    public void setVolName(String volName) {
        VolName = volName;
    }

    public String getVolPhone() {
        return VolPhone;
    }

    public void setVolPhone(String volPhone) {
        VolPhone = volPhone;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
