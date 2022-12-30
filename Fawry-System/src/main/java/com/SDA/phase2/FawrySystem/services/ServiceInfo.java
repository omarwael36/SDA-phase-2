package com.SDA.phase2.FawrySystem.services;

import java.util.ArrayList;

public class ServiceInfo {
    private int Index = 0;
    private String Name;
    private double Amount;
    private boolean CashOnDelivery;
    public ArrayList<ServiceProvider> SP = new ArrayList<ServiceProvider>();
    public ServiceInfo(){
        Index++;
        this.Name = " ";
        Amount = 0;
    }
    public void SetSP(String name, double tax){
       ServiceProvider temp = new ServiceProvider(name,tax);
       SP.add(temp);
    }
    public void getSP(){
        if(SP.isEmpty()){
            System.out.println("There are no providers for this service !");
        }
        else{
            for(int i = 0 ;i<SP.size();i++){
                System.out.println(SP.get(i).getName());
            }
        }
    }
    public int getIndex() {
        return Index;
    }

    public void setIndex(int index) {
        Index = index;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public boolean isCashOnDelivery() {
        return CashOnDelivery;
    }

    public void setCashOnDelivery(boolean cashOnDelivery) {
        CashOnDelivery = cashOnDelivery;
    }
}
