package model;

import java.sql.Date;

public class BookCard {
    private String bookBorrowId;
    private int bookId;
    private int studentId;
    private boolean status;
    private Date borrowDate;
    private Date returnDate;
    private Book book;
    private Student student;

    public BookCard(String bookBorrowId, int bookId, int studentId, boolean status, Date borrowDate, Date returnDate, Book book, Student student) {
        this.bookBorrowId = bookBorrowId;
        this.bookId = bookId;
        this.studentId = studentId;
        this.status = status;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.book = book;
        this.student = student;
    }

    public BookCard() {
    }

    public BookCard(String bookBorrowId, int bookId, int studentId, boolean status, Date borrowDate, Date returnDate) {
        this.bookBorrowId = bookBorrowId;
        this.bookId = bookId;
        this.studentId = studentId;
        this.status = status;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public String getBookBorrowId() {
        return bookBorrowId;
    }

    public void setBookBorrowId(String bookBorrowId) {
        this.bookBorrowId = bookBorrowId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
