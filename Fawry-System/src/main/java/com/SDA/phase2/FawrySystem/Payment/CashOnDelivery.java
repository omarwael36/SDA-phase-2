package com.SDA.phase2.FawrySystem.Payment;

public class CashOnDelivery extends payment {
    private String Address;

    public CashOnDelivery() {
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
    public String Pay(double payed,double cost){
        return "please pay the cost of the service to the delivery !!";
    }
}
