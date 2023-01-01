package com.SDA.phase2.FawrySystem.User;
import com.SDA.phase2.FawrySystem.Refund.RefundRequest;
import com.SDA.phase2.FawrySystem.Refund.Transactions;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class UserController {

    public ArrayList <Userinfo> Users = new ArrayList <Userinfo> () ;

    public boolean SignUp (String email ,String username, String pass,String address)
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
                    if (Users.get(i).UTransactions.get(j).id == id )
                    {
                       Transactions ss = new Transactions();
                       ss.Ownername = usrname;
                       ss.id = id;
                       RefundRequest a = new RefundRequest();
                       a.Refundreq.add(ss);
                    }
                }
            }
        }
    }

}