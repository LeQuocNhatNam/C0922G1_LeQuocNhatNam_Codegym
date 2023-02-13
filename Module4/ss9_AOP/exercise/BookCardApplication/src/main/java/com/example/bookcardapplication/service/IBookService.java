package com.example.bookcardapplication.service;

import com.example.bookcardapplication.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAdd();

    Book findById(int id);

    void save(Book book);

    void rent(int id);
}
