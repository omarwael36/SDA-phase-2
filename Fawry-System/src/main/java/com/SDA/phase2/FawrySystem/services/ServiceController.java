package com.SDA.phase2.FawrySystem.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;


@Service
public class ServiceController {
    public ArrayList<DiscountInfo> Discounts = new ArrayList<DiscountInfo>();
    public ArrayList<ServiceInfo> services = new ArrayList<ServiceInfo>();

    public ServiceController(){
        ServiceInfo s1 = new ServiceInfo();
        s1.setName("Mobile recharge");
        s1.setIndex(1);
        s1.setCashOnDelivery(false);
        ServiceProvider sp1 = new ServiceProvider("vodafone",0.14,1);
        s1.SP.add(sp1);
        ServiceProvider sp2 = new ServiceProvider("etisalat",0.14,2);
        s1.SP.add(sp2);
        ServiceProvider sp3 = new ServiceProvider("we",0.14,3);
        s1.SP.add(sp3);
        ServiceProvider sp4 = new ServiceProvider("orange",0.14,4);
        s1.SP.add(sp4);
        services.add(s1);

        ServiceInfo s2 = new ServiceInfo();
        s2.setName("Internet payment");
        s2.setIndex(2);
        s2.setCashOnDelivery(false);
        ServiceProvider sp01 = new ServiceProvider("vodafone",0.14,1);
        s2.SP.add(sp01);
        ServiceProvider sp02 = new ServiceProvider("etisalat",0.14,2);
        s2.SP.add(sp02);
        ServiceProvider sp03 = new ServiceProvider("we",0.14,3);
        s2.SP.add(sp03);
        ServiceProvider sp04 = new ServiceProvider("orange",0.14,4);
        s2.SP.add(sp04);
        services.add(s2);

        ServiceInfo s3 = new ServiceInfo();
        s3.setName("Landline");
        s3.setIndex(3);
        s3.setCashOnDelivery(false);
        services.add(s3);

        ServiceInfo s4 = new ServiceInfo();
        s4.setName("Donations");
        s4.setIndex(4);
        s4.setCashOnDelivery(false);
        ServiceProvider sp001 = new ServiceProvider("Cancer Hospitals",0.10,1);
        s4.SP.add(sp001);
        ServiceProvider sp002 = new ServiceProvider("Schools",0.10,2);
        s4.SP.add(sp002);
        ServiceProvider sp003 = new ServiceProvider("NGOs (Non profitable organizations)",0.10,3);
        s4.SP.add(sp003);
        services.add(s4);

        DiscountInfo di1 = new DiscountInfo(0.5,"First Transaction","Overall Discount",1,"Mobile recharge");
        Discounts.add(di1);
        DiscountInfo di2 = new DiscountInfo(0.2,"sale","Specific Discount",2,"Internet payment");
        Discounts.add(di2);


    }
    public ArrayList<String> SearchService(String key){
        boolean flag = false;
        ArrayList<String> match = new ArrayList<String>();
        match.clear();
        for(int i =0;i<services.size();i++) {
            if(services.get(i).getName().equals(key)) {
                flag = true;
                match.add(services.get(i).getName());
            }
        }
        if(flag==false) {
            match.add("Not found");
        }
        return match;
    }
    public ServiceProvider SelectSP(int spid, String serviceName){
        for(int i = 0; i<services.size();i++){
            if(Objects.equals(services.get(i).getName(), serviceName)){
                for(int j = 0 ; j<services.get(i).SP.size() ; j++){
                    if(services.get(i).SP.get(j).getSPID()==spid){
                        return services.get(i).SP.get(j);
                    }
                }
            }
        }
       ServiceProvider sp = new ServiceProvider("not found ",0,0);
        return sp;
    }
    public double UpdatePrice(double amount,String serviceName){
        for(int i = 0; i<services.size();i++){
            if(Objects.equals(services.get(i).getName(), serviceName)){
                services.get(i).setAmount(amount);
                return services.get(i).getAmount();
            }
        }
        return 0;
    }
    public String SelectService(int id){
        for(int i = 0 ; i<services.size();i++){
            if(services.get(i).getIndex()==id){
                return services.get(i).getName();
            }
        }
        return "";
    }
    public double SelectDiscount(int id){
        for(int i = 0 ; i<Discounts.size();i++){
            if(Discounts.get(i).getID()==id){
                return Discounts.get(i).getRate();
            }
        }
        return 0;
    }
    public ArrayList<ServiceInfo> getServices() {
        return services;
    }

    public ArrayList<DiscountInfo> getDiscounts() {
        return Discounts;
    }
}
