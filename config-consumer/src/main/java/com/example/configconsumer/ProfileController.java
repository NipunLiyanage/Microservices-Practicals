package com.example.configconsumer;

import com.example.configconsumer.model.MemberProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {


    @Autowired
    MemberProfileConfiguration memberProfileConfiguration;


    @RequestMapping("/profile")
    public MemberProfileConfiguration getConfig(Model model){
        return memberProfileConfiguration;



    }

}
