package com.SDA.phase2.FawrySystem.User;
import com.SDA.phase2.FawrySystem.Payment.CreditCard;
import com.SDA.phase2.FawrySystem.Payment.Wallet;
import com.SDA.phase2.FawrySystem.Refund.RefundRequest;
import com.SDA.phase2.FawrySystem.Refund.Transactions;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class UserController {

    public ArrayList <Userinfo> Users = new ArrayList <Userinfo> () ;

    public UserController() {
        Userinfo ui1 = new Userinfo("omarwael@gmail.com","123456","omarwael","cairo,egypt");
        Wallet w = new Wallet(1,200);
        ui1.setUwallet(w);
        CreditCard cc = new CreditCard("12345","2025/5","5235",5000);
        ui1.setUcredit(cc);
        Users.add(ui1);
    }

    public boolean SignUp (String email , String username, String pass, String address)
    {
        for (int i = 0; i < Users.size(); i++) {
            if (Objects.equals(email, Users.get(i).getemail())) {
                return false;
            }
        }
        Userinfo temp = new Userinfo();
        temp.setemail(email);
        temp.setpassword(pass);
        temp.setusername(username);
        temp.setAddress(address);
        Users.add(temp);
        return true;
    }
    public boolean Login (String mail , String pass)
    {
        for (int i = 0; i < Users.size(); i++)
        {
            if (Objects.equals(mail, Users.get(i).getemail()))
            {
                if (Objects.equals(pass, Users.get(i).getpassword()))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public void Requestrefund (int id , String usrname)
    {
        for (int i = 0 ; i < Users.size() ; i++ )
        {
            if (Users.get(i).getusername() == usrname)
            {
                for (int j = 0 ; j < Users.get(i).UTransactions.size() ; j++)
                {
                    if (Users.get(i).UTransactions.get(j).getId() == id )
                    {
                       Transactions ss = new Transactions();
                       ss.setOwnername(usrname);
                       ss.setId(id);
                       RefundRequest a = new RefundRequest();
                       a.Refundreq.add(ss);
                    }
                }
            }
        }
    }

}