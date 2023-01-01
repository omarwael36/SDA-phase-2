package com.SDA.phase2.FawrySystem.services;

public class ServiceProvider {
    private String Name;
    private double Tax;
    private int SPID;

    public ServiceProvider() {
    }

    public ServiceProvider(String name, double tax) {
        Name = name;
        Tax = tax;
    }

    public ServiceProvider(String name, double tax, int SPID) {
        Name = name;
        Tax = tax;
        this.SPID = SPID;
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
