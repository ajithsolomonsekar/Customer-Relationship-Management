package com.ajithsolomon.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CRMRepository extends JpaRepository<String, String> {

}
