package repository;

import model.Book;
import model.BookCard;

import java.util.List;

public interface IBookRepository {
        List<Book> findAll();

    boolean save(BookCard bookCard);
}
