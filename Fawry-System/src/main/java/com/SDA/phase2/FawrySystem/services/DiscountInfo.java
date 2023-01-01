package com.SDA.phase2.FawrySystem.services;

public class DiscountInfo {
    private double Rate;
    private String Name;
    private String Type;
    private int ID;
    private String DiscountOn;

    public String getDiscountOn() {
        return DiscountOn;
    }

    public void setDiscountOn(String discountOn) {
        DiscountOn = discountOn;
    }

    public DiscountInfo() {
    }

    public DiscountInfo(double rate, String name, String type, int ID,String dison) {
        Rate = rate;
        Name = name;
        Type = type;
        this.ID = ID;
        this.DiscountOn = dison;
    }


    public double getRate() {
        return Rate;
    }

    public void setRate(double rate) {
        Rate = rate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
