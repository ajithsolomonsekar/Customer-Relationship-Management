package com.ajithsolomon.crm.service.impl;

import com.ajithsolomon.crm.entity.Customer;
import com.ajithsolomon.crm.repository.CRMRepository;
import com.ajithsolomon.crm.service.CRMService;
import com.ajithsolomon.crm.utility.CommonResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CRMServiceImpl implements CRMService {

    private CRMRepository repo;

    @Autowired
    public CRMServiceImpl(CRMRepository repo) {
        this.repo = repo;
    }

    public ResponseEntity<CommonResponseTemplate<List<Customer>>> getAllCustomers() {

        CommonResponseTemplate<List<Customer>> response = new CommonResponseTemplate<>();
        List<Customer> customerList = repo.findAll();
        if(customerList.isEmpty() || customerList.equals(null)) {
            response.setResponseObject(new ArrayList<Customer>());
            response.setResponseMsg("No customer details found");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        response.setResponseObject(customerList);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public ResponseEntity<CommonResponseTemplate<Customer>> getCustomer(int id){

        CommonResponseTemplate<Customer> response = new CommonResponseTemplate<>();
        Optional<Customer> dbResponse = repo.findById(id);
        if(dbResponse.isPresent()) {
            response.setResponseObject(dbResponse.get());
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        response.setResponseMsg("No customer details found");
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

}
