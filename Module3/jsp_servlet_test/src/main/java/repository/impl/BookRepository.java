package repository.impl;

import model.Book;
import model.BookCard;
import repository.BaseRepository;
import repository.IBookRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookRepository implements IBookRepository {
    private static final String SELECT_ALL_BOOKS ="select * from book;";
    private static final String INSERT_INTO_BOOK_CARD ="insert into book_card values (?,?,?,?,?,?);";
    @Override
    public List<Book> findAll() {
        List<Book> bookList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL_BOOKS);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String author = resultSet.getString("author");
                String description = resultSet.getString("description");
                int numberOfBooks = resultSet.getInt("number_of_books");
                bookList.add(new Book(id,name,author,description,numberOfBooks));
            }
            return bookList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean save(BookCard bookCard) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_BOOK_CARD);
            preparedStatement.setString(1,bookCard.getBookBorrowId());
            preparedStatement.setInt(2,bookCard.getBookId());
            preparedStatement.setInt(3,bookCard.getStudentId());
            preparedStatement.setBoolean(4,bookCard.isStatus());
            preparedStatement.setDate(5,bookCard.getBorrowDate());
            preparedStatement.setDate(6,bookCard.getReturnDate());
            return preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
