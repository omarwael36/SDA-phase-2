package com.SDA.phase2.FawrySystem.User;

import java.util.Scanner;

public class UserScreen {

    public void displayLogin (UserController s)
    {
        System.out.print("Welcome ......");
        System.out.print("Please enter your email");
        Scanner obj = new Scanner (System.in);
        String mail = obj.next();
        System.out.print("Please enter your password");
        String password = obj.next();
        if (s.Login(mail,password))
        {
            System.out.print("Login Successfully !! ");
        }
        else
            System.out.print("Invalid email or password");
    }
    public void displaySignUp (UserController s)
    {
        System.out.print("Welcome ......");
        System.out.print("Please enter your email to sign up");
        Scanner obj = new Scanner (System.in);
        String mail = obj.next();
        System.out.print("Please enter your password to sign up");
        String password = obj.next();
        if (s.Login(mail,password))
        {
            System.out.print(" Signed in !! ");
        }
        else
            System.out.print("This email already exists !");
    }
    public void displayTransactions (UserController s)
    {
        System.out.print("Please enter Username to complete the process");
        Scanner obj = new Scanner (System.in);
        String username = obj.next();

        for (int i = 0 ; i < s.Users.size() ; i++)
        {
            if (username == s.Users.get(i).username)
            {
              /* for (int j = 0 ; i< s.Users.get(i).Utansactions.size() ; i++)
                {
                    System.out.print(Utransactions.get(j);)
                }

               */
            }
        }

    }

}
