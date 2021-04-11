package com.ajithsolomon.crm.service;

import com.ajithsolomon.crm.entity.Customer;
import com.ajithsolomon.crm.utility.CommonResponseTemplate;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CRMService {

    ResponseEntity<CommonResponseTemplate<List<Customer>>> getAllCustomers();

    ResponseEntity<CommonResponseTemplate<Customer>> getCustomer(int id);
}
