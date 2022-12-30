package com.SDA.phase2.FawrySystem.services;

import java.util.ArrayList;



public class ServiceController {
    public ArrayList<DiscountInfo> Discounts = new ArrayList<DiscountInfo>();
    public ArrayList<ServiceInfo> services = new ArrayList<ServiceInfo>();
    public boolean SearchService(String key){
        boolean flag = false;
        for(int i =0;i<services.size();i++) {
            if(services.get(i).getName().compareTo(key)>=0) {
                System.out.println(services.get(i));
                flag=true;
            }
        }
        if(flag==false) {
            System.out.println("Not found !");
        }
        return flag;
    }
    public Object SelectSP(int spid, String serviceName){
        for(int i = 0; i<services.size();i++){
            if(services.get(i).getName()==serviceName){
                for(int j = 0 ; j<services.get(i).SP.size() ; j++){
                    if(services.get(i).SP.get(j).getSPID()==spid){
                        return services.get(i).SP.get(j);
                    }
                }
            }
        }
       ServiceProvider sp = new ServiceProvider(" ",0);
        return sp;
    }
    public void UpdatePrice(double amount,String serviceName){
        for(int i = 0; i<services.size();i++){
            if(services.get(i).getName()==serviceName){
                services.get(i).setAmount(amount);
            }
        }
    }
}
