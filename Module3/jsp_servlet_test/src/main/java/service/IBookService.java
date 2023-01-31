package service;

import model.Book;
import model.BookCard;

import java.util.List;

public interface IBookService {
    List<Book> findAll();

    boolean save(BookCard bookCard);
}
