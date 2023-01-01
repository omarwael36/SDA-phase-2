package com.SDA.phase2.FawrySystem.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ServiceAPI {
    ServiceController sc = new ServiceController();
    @GetMapping(value = "/services/DisplayServices")
    public ArrayList<ServiceInfo> DisplayServices(){
        return sc.getServices();
    }

    @PostMapping(value = "/services/SearchService")
    public String SearchService(@RequestParam String key){
        if(sc.SearchService(key)){
            return "found the result !!";
        }
        else{
            return "Not found !!";
        }
    }

}
