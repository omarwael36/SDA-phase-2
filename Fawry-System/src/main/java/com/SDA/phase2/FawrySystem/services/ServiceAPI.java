package com.SDA.phase2.FawrySystem.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ServiceAPI {
    ServiceController sc = new ServiceController();
    @GetMapping(value = "/services/DisplayServices")
    public ArrayList<ServiceInfo> DisplayServices(){
        return sc.getServices();
    }

    @PostMapping(value = "/services/SearchService")
    public ArrayList<String> SearchService(@RequestParam String key){
        return sc.SearchService(key);
    }
    @PostMapping(value = "/services/SelectSP")
    public Object SelectSP(@RequestParam int spid , String servicename){
       return sc.SelectSP(spid,servicename);
    }
    @GetMapping(value = "/services/DisplayDiscount")
    public ArrayList<DiscountInfo> DisplayDiscount(){
        return sc.getDiscounts();
    }
    @PostMapping(value = "/services/SelectService")
    public Object SelectService(@RequestParam int id){
        return sc.SelectService(id);
    }
    @PostMapping(value = "/services/SelectDiscount")
    public Object SelectDiscount(@RequestParam int id){
        return sc.SelectDiscount(id);
    }
    @PostMapping(value = "/services/DisplayCost")
    public double DisplayCost(@RequestParam double amount , String servicename,int spid,int llchoice,int disID){
        double price = 0;
        if(servicename.equals("Mobile recharge")){
            service mc = new MobileRecharge();
            Discount oad = new OverallDiscount(sc , mc);
            price = oad.cost(sc.SelectSP(spid,servicename),amount,sc.SelectDiscount(disID));
        }
        else if(servicename.equals("Internet payment")){
            service ip = new InternetPayment(sc);
            Discount sd = new SpecificDiscount(sc,ip);
            price = sd.cost(sc.SelectSP(spid,servicename),amount,sc.SelectDiscount(disID));
        }
        else if(servicename.equals("Landline")){
                if(llchoice == 1){
                    service qr = new QuarterReceipt(sc);
                    qr.cost(sc.SelectSP(spid, servicename),amount,sc.SelectDiscount(disID));
                }
                else if(llchoice == 2){
                    service mr = new MonthlyReceipt(sc);
                    mr.cost(sc.SelectSP(spid, servicename),amount,sc.SelectDiscount(disID));
                }
        }
        else if(servicename.equals("Donations")){
            service don = new Donations(sc);
            don.cost(sc.SelectSP(spid, servicename),amount,sc.SelectDiscount(disID));
        }

        return sc.UpdatePrice(price,servicename);
    }
}
