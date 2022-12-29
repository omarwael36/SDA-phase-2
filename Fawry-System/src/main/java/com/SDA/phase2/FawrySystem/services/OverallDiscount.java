package com.SDA.phase2.FawrySystem.services;

public class OverallDiscount extends Discount{
    public OverallDiscount(service ser) {
        super(ser);
    }

    public double cost(ServiceProvider sp, double amount){
        return ser.cost(sp,amount) - (ser.cost(sp,amount)* this.DI.getRate());
    }
}
