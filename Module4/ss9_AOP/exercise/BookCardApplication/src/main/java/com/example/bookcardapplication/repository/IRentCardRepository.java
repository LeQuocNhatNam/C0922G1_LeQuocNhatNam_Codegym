package com.example.bookcardapplication.repository;

import com.example.bookcardapplication.model.RentCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IRentCardRepository extends JpaRepository<RentCard,Integer> {
}
