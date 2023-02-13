package com.example.bookcardapplication.service;

import com.example.bookcardapplication.model.RentCard;
import com.example.bookcardapplication.repository.IRentCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentCardService implements IRentCardService {
    @Autowired
    private IRentCardRepository rentCardRepository;
    @Override
    public int save(int bookRentId) {
        int rentId = (int) (Math.round((Math.random()*100000)));
        RentCard rentCard = new RentCard();
        rentCard.setRentId(rentId);
        rentCard.setBookRentId(bookRentId);
        rentCardRepository.save(rentCard);
        return rentId;
    }

    @Override
    public List<RentCard> findAll() {
        return rentCardRepository.findAll();
    }

    @Override
    public void remove(int id) {
        rentCardRepository.deleteById(id);
    }


}
