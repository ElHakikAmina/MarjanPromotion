package com.youcode.Marjan.Repositories;

import com.youcode.Marjan.Models.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>
{

}
