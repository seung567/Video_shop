package com.video.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.video.main.service.indexService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class indexController {
    
    @Autowired
    indexService indexService2;

    @RequestMapping ("/")
    public String indexGetName(Model model){
        
        return indexService2.indexGetName();
    }
    
}
