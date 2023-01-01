package com.SDA.phase2.FawrySystem.User;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class UserAPI {
    public UserController c = new UserController();
    @PostMapping(value = "/User/DisplaySignup")
    public String DisplaySignup(@RequestParam String email ,String username, String pass,String address){
        if(c.SignUp(email ,username, pass,address)){
            return "SignUp Successfully !! ";
        }
        return "This email already exists !";
    }
    @PostMapping(value = "/User/DisplayLogin")
    public String DisplayLogin (@RequestParam String email , String pass)
    {
        if (c.Login(email,pass))
        {
            return ("Login Successfully !! ");
        }
        else
            return ("Invalid email or password");
    }
}
