package com.SDA.phase2.FawrySystem.Payment;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentAPI {
    @PostMapping(value = "/Payment/DisplayPayment")
    public String DisplayPayment(double cost,double payed,int choice){
        PaymentController pc = new PaymentController();
        if(choice == 1){
            payment w = new Wallet();
            return w.Pay(payed,cost);
        }
        else if(choice == 2){
            payment cc = new CreditCard();
            return cc.Pay(payed,cost);
        }
        else{
            payment cod = new CashOnDelivery();
            return cod.Pay(payed,cost);
        }
    }
}
