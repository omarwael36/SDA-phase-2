package com.SDA.phase2.FawrySystem.User;
import java.util.ArrayList;

public class UserController {

    public ArrayList <Userinfo> Users = new ArrayList <Userinfo> () ;

    public boolean SignUp (String mail , String pass)
    {
        for (int i = 0; i < Users.size(); i++)
        {
            if (mail == Users.get(i).getemail())
            {
                return false;
            }
            else
            {
                Userinfo New = new Userinfo();
                New.setemail(mail);
                New.setpassword(pass);
                Users.add(New);
                return true;
            }
        }
        return false;
    }

    public boolean Login (String mail , String pass)
    {
        for (int i = 0; i < Users.size(); i++)
        {
            if (mail == Users.get(i).getemail())
            {
                if (pass == Users.get(i).getpassword())
                {
                    return true;
                }
            }
        }
        return false;

    }

    public void Requestrefund ()
    {

    }

}