package com.example.case_study.repository.customer;

import com.example.case_study.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
    @Query(value = "select * from customer where name like :name and email like :email and customer_type_id like :customer_type_id and flag = true", nativeQuery = true)
    Page<Customer> findAllCustomerByNameAndEmailAndCustomerTypeId(@Param("name") String name, @Param("email") String email, @Param("customer_type_id") int customerTypedId, Pageable pageable);
    @Query(value = "select * from customer where name like :name and email like :email and flag = true", nativeQuery = true)
    Page<Customer> findByNameAndEmail(@Param("name") String name, @Param("email") String email, Pageable pageable);

}
