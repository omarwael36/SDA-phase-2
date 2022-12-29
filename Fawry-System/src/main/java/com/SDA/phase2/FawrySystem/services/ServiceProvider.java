package com.SDA.phase2.FawrySystem.services;

public class ServiceProvider {
    private String Name;
    private double Tax;
    private int SPID;
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

    public int getSPID() {
        return SPID;
    }

    public void setSPID(int SPID) {
        this.SPID = SPID;
    }
}
