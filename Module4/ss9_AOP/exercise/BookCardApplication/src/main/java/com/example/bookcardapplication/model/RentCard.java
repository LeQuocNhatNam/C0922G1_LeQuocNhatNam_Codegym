package com.example.bookcardapplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RentCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int bookRentId;

    public RentCard(int id, int bookRentId, int rentId) {
        this.id = id;
        this.bookRentId = bookRentId;
        this.rentId = rentId;
    }

    public int getBookRentId() {
        return bookRentId;
    }

    public void setBookRentId(int bookRentId) {
        this.bookRentId = bookRentId;
    }

    private int rentId;

    public RentCard() {
    }

    public RentCard(int id, int rentId) {
        this.id = id;
        this.rentId = rentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRentId() {
        return rentId;
    }

    public void setRentId(int rentId) {
        this.rentId = rentId;
    }
}
