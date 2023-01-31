package repository;

import model.BookCard;

import java.util.List;

public interface IBookCardRepository {
    List<BookCard> findAll();

    List<BookCard> findSearch(String bookSearch, String studentSearch);
}
