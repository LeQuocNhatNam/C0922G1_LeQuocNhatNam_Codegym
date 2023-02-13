package com.example.bookcardapplication.service;


import com.example.bookcardapplication.model.Book;
import com.example.bookcardapplication.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository bookRepository;
    @Override
    public List<Book> findAdd() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(int id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void rent(int id) {
        Book book = bookRepository.findById(id).get();
        book.setQuantity(book.getQuantity()-1);
        bookRepository.save(book);
    }
}
