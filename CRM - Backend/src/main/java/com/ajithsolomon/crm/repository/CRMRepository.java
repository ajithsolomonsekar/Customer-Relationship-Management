package com.ajithsolomon.crm.repository;

import com.ajithsolomon.crm.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CRMRepository extends JpaRepository<Customer, Integer> {

}
