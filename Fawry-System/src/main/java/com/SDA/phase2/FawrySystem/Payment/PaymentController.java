package com.SDA.phase2.FawrySystem.Payment;

import org.springframework.stereotype.Service;

@Service
public class PaymentController {
    public boolean CheckPayement(double payed,double cost){
        if(payed >= cost){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean CheckBalance(double balance,double cost){
        if(balance >= cost){
            return true;
        }
        else {
            return false;
        }
    }
}
