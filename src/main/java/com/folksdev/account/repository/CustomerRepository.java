package com.folksdev.account.repository;

import com.folksdev.account.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface CustomerRepository extends JpaRepository<Customer,String> {
}
