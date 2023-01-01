package com.SDA.phase2.FawrySystem.services;

public class ServiceScreen {
    ServiceController sc = new ServiceController();
    public void DisplayDiscount(){
        for (int i = 0;i<sc.Discounts.size();i++) {
            System.out.println("Discount name is : " + sc.Discounts.get(i).getName());
            System.out.println("Discount type is : " + sc.Discounts.get(i).getType());
            System.out.println("Discount rate is : " + sc.Discounts.get(i).getRate() + "%");
        }

    }
    public void DisplayServices(){
        for(int i = 1;i<=sc.services.size();i++){
            System.out.println(i + "- " + "service name is : " + sc.services.get(i).getName());
        }
    }

}
