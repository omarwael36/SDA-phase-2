package com.SDA.phase2.FawrySystem.services;

public abstract class service {
    public ServiceInfo SI =new ServiceInfo();
    public abstract double cost(ServiceProvider sp,double amount);

}
