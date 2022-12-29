package com.SDA.phase2.FawrySystem.services;

public class ServiceProvider {
    private String Name;
    private double Tax;
    public ServiceProvider(String name,double tax){
        this.Name = name;
        this.Tax = tax;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getTax() {
        return Tax;
    }

    public void setTax(double tax) {
        Tax = tax;
    }
}
