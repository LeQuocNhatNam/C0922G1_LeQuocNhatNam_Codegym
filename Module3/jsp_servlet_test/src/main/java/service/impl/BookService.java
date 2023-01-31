package service.impl;

import model.Book;
import model.BookCard;
import repository.IBookRepository;
import repository.impl.BookRepository;
import service.IBookService;

import java.util.List;

public class BookService implements IBookService {
    private IBookRepository bookRepository = new BookRepository();
    @Override
    public List<Book> findAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public boolean save(BookCard bookCard) {
        return this.bookRepository.save(bookCard);
    }
}
