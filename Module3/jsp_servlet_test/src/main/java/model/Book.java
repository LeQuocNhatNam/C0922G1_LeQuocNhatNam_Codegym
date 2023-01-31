package model;

public class Book {
    private int id;
    private String name;
    private String author;
    private String description;
    private int numberOfBooks;

    public Book() {
    }

    public Book(int id, String name, String author, String description, int number_of_books) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.description = description;
        this.numberOfBooks = number_of_books;
    }

    public Book(int bookId, String bookName, String author) {
        this.id = bookId;
        this.name = bookName;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }
}
