package com.SDA.phase2.FawrySystem.services;

public abstract class Landline extends service{
    public Landline() {
    }

    public Landline(ServiceController sc) {
        super(sc);
    }

    public abstract double cost(ServiceProvider sp, double amount,double dis);
}