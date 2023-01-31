package repository.impl;

import model.Book;
import model.BookCard;
import model.Student;
import repository.BaseRepository;
import repository.IBookCardRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookCardRepository implements IBookCardRepository {
    private static final String SELECT_ALL_BOOK_CARD = "select bc.*, b.name,b.author, s.name as student_name, s.class_name from book_card bc join student s on s.id = bc.student_id join book b on b.id = bc.book_id  ;\n";
    private static final String SELECT_ALL_BOOK_CARD_SEARCH = "select bc.*, b.name,b.author, s.name as student_name, s.class_name from book_card bc\n" +
            " join student s on s.id = bc.student_id \n" +
            " join book b on b.id = bc.book_id where s.name like ? and b.name like ? and status = false ;";

    @Override
    public List<BookCard> findAll() {
        List<BookCard> bookCardList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BOOK_CARD);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String borrowBookId = resultSet.getString("id");
                String bookName = resultSet.getString("name");
                String author = resultSet.getString("author");
                int bookId = resultSet.getInt("book_id");
                int studentId = resultSet.getInt("student_id");
                boolean status = resultSet.getBoolean("status");
                Date borrowDate = resultSet.getDate("borrow_date");
                Date returnDate = resultSet.getDate("return_date");
                String studentName = resultSet.getString("student_name");
                String className = resultSet.getString("class_name");
                Student student = new Student(studentId, studentName, className);
                Book book = new Book(bookId, bookName, author);
                BookCard bookCard = new BookCard(borrowBookId, bookId, studentId, status, borrowDate, returnDate, book, student);
                bookCardList.add(bookCard);
            }
            return bookCardList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<BookCard> findSearch(String bookSearch, String studentSearch) {
        List<BookCard> bookCardList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BOOK_CARD_SEARCH);
            preparedStatement.setString(1, "%" + studentSearch + "%");
            preparedStatement.setString(2, "%" + bookSearch + "%");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String borrowBookId = resultSet.getString("id");
                String bookName = resultSet.getString("name");
                String author = resultSet.getString("author");
                int bookId = resultSet.getInt("book_id");
                int studentId = resultSet.getInt("student_id");
                boolean status = resultSet.getBoolean("status");
                Date borrowDate = resultSet.getDate("borrow_date");
                Date returnDate = resultSet.getDate("return_date");
                String studentName = resultSet.getString("student_name");
                String className = resultSet.getString("class_name");
                Student student = new Student(studentId, studentName, className);
                Book book = new Book(bookId, bookName, author);
                BookCard bookCard = new BookCard(borrowBookId, bookId, studentId, status, borrowDate, returnDate, book, student);
                bookCardList.add(bookCard);
            }
            return bookCardList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
