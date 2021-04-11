package com.ajithsolomon.crm.controller;

import com.ajithsolomon.crm.entity.Customer;
import com.ajithsolomon.crm.service.CRMService;
import com.ajithsolomon.crm.utility.CommonResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crm")
public class CRMController {

    private CRMService service;

    @Autowired
    public CRMController(CRMService service) {
        this.service = service;
    }

    @GetMapping("/getAllCustomers")
    public ResponseEntity<CommonResponseTemplate<List<Customer>>> getAllCustomers(){
        return service.getAllCustomers();
    }

    @GetMapping("/getCustomer/{id}")
    public ResponseEntity<CommonResponseTemplate<Customer>> getCustomer(@PathVariable int id){
        return service.getCustomer(id);
    }

    @PostMapping("/addCustomer")
    public String addCustomer(@RequestBody Customer customer){
        return "OK";
    }

    @PutMapping("/updateCustomer")
    public String updateCustomer(@RequestBody Customer customer){
        return "OK";
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable int id){
        return "OK";
    }




}
