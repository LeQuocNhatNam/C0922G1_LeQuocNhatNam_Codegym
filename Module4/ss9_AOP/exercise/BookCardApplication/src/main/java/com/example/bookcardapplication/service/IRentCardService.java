package com.example.bookcardapplication.service;

import com.example.bookcardapplication.model.RentCard;

import java.util.List;

public interface IRentCardService {
    int save(int bookRentId);
    List<RentCard> findAll();
    void remove(int id);
}
