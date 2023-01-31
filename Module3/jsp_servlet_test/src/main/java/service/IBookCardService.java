package service;

import model.BookCard;

import java.util.List;

public interface IBookCardService {
    List<BookCard> findAll();

    List<BookCard> findSearch(String bookSearch, String studentSearch);
}
