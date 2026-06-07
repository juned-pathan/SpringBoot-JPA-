package com.nt.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.nt.entity.Customer;

public interface ICustomerRepository extends CrudRepository<Customer, Integer> {

}
