package service.impl;

import model.BookCard;
import repository.IBookCardRepository;
import repository.impl.BookCardRepository;
import service.IBookCardService;

import java.util.List;

public class BookCardService implements IBookCardService {
    private IBookCardRepository bookCardRepository = new BookCardRepository();
    @Override
    public List<BookCard> findAll() {
        return this.bookCardRepository.findAll();
    }

    @Override
    public List<BookCard> findSearch(String bookSearch, String studentSearch) {
        return this.bookCardRepository.findSearch(bookSearch,studentSearch);
    }
}
