package com.SDA.phase2.FawrySystem.Admin;

import com.SDA.phase2.FawrySystem.Refund.Transactions;
import com.SDA.phase2.FawrySystem.User.Userinfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AdminAPI {
    AdminController ac = new AdminController();
    @PostMapping(value = "/Admin/DisplayTransaction")
    public ArrayList<Transactions> DisplayUserTransactions(@RequestParam String username){

        return ac.ShowUserTransactions(ac.SearchUser(username);)
    }
    @PostMapping(value = "/Admin/AddDiscount")
    public String AddDiscount(@RequestParam double rate, String name, String type, int ID,String dison){
        ac.AddDiscount(rate,name,type,ID,dison);
        return "Discount Added Successfully";
    }
}
