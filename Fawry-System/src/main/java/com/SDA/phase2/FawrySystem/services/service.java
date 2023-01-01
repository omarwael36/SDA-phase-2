package com.SDA.phase2.FawrySystem.services;

public abstract class service {
    public ServiceController sc = new ServiceController();

    public service() {

    }

    public service(ServiceController sc) {
        this.sc = sc;
    }

    public abstract double cost(ServiceProvider sp, double amount,double dis);

}
