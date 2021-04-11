package com.ajithsolomon.crm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crm")
public class CRMController {

    @GetMapping("/hello")
    public String getMessage(){
        return "Hi Ajith! Welcome";
    }
}
