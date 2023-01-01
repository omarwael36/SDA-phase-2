package com.SDA.phase2.FawrySystem.Admin;

import com.SDA.phase2.FawrySystem.Refund.RefundController;
import com.SDA.phase2.FawrySystem.Refund.Transactions;
import com.SDA.phase2.FawrySystem.User.UserController;
import com.SDA.phase2.FawrySystem.User.Userinfo;
import com.SDA.phase2.FawrySystem.services.DiscountInfo;
import com.SDA.phase2.FawrySystem.services.ServiceController;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdminController {
    ServiceController sc = new ServiceController();
    UserController uc = new UserController();
    RefundController refund = new RefundController();
    public void AddnewSP ()
    {

    }
    public Userinfo SearchUser(String username){
        for(int i = 0; i<uc.Users.size();i++){
            if(uc.Users.get(i).getusername().equals(username)){
                return uc.Users.get(i);
            }
        }
        Userinfo ui= new Userinfo();
        return ui;
    }
    public void AddDiscount (double rate, String name, String type, int ID,String dison)
    {
        DiscountInfo di = new DiscountInfo(rate,name,type,ID,dison);
        sc.Discounts.add(di);
    }
    public ArrayList<Transactions> ShowUserTransactions (Userinfo user)
    {
        return user.getUTransactions();
    }
    public void ShowRefund (int id)
    {
        for (int i = 0 ; i < refund.Req.Refundreq.size() ; i++)
        {
            if (refund.Req.Refundreq.get(i).getId() == id) {
                if (refund.Req.Refundreq.get(i).isApproved()) {
                    System.out.print("Refund Approved !!");
                } else if (refund.Req.Refundreq.get(i).getId() == id == false) {
                    System.out.print("Refund Declined !!");
                }
            }
        }
    }
    public void AcceptRefund (int id)
    {
        for (int i = 0 ; i < refund.Req.Refundreq.size() ; i++)
        {
            if (refund.Req.Refundreq.get(i).getId() == id)
            {
                refund.Req.Refundreq.get(i).setApproved(true);
            }
        }
    }
}
