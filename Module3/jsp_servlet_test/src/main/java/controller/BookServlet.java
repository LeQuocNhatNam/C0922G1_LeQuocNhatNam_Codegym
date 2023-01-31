package controller;

import model.Book;
import model.BookCard;
import model.Student;
import repository.IStudentRepository;
import repository.impl.StudentRepository;
import service.IBookService;
import service.impl.BookService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet(name = "Servlet", value = "/book")
public class BookServlet extends HttpServlet {
private IBookService bookService = new BookService();
private IStudentRepository studentRepository = new StudentRepository();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "borrow":
                showBorrowForm(request, response);
                break;
            case "edit":
                showEditForm(request,response);
                break;
            case "search":
                search(request,response);
                break;
            default:
                showList(request, response);
                break;
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showBorrowForm(HttpServletRequest request, HttpServletResponse response) {
        List<Student> studentList = this.studentRepository.findAll();
        request.setAttribute("studentList",studentList);
        int bookId = Integer.parseInt(request.getParameter("bookId"));
        String bookName = request.getParameter("bookName");
       request.setAttribute("bookId",bookId);
       request.setAttribute("bookName",bookName);
        try {
            request.getRequestDispatcher("view/book/borrow.jsp").forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List< Book> bookList = this.bookService.findAll();
        request.setAttribute("bookList",bookList);
        try {
            request.getRequestDispatcher("view/book/list.jsp").forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "borrow":
                borrow(request, response);
                break;
            case "delete":
                delete(request,response);
                break;

        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
    }

    private void borrow(HttpServletRequest request, HttpServletResponse response)  {
        String bookBorrowId = request.getParameter("bookBorrowId");
        int bookId = Integer.parseInt(request.getParameter("bookId"));
        int studentId = Integer.parseInt(request.getParameter("studentId"));
        Date borrowDate = Date.valueOf(request.getParameter("borrowDate"));
        Date returnDate = Date.valueOf(request.getParameter("returnDate"));
        boolean status = false;

        BookCard bookCard = new BookCard(bookBorrowId,bookId,studentId,status,borrowDate,returnDate);
        String message = "Borrow successfully";
        if (!this.bookService.save(bookCard)) {
            message = "Fail to borrow";
        }
        try {
            request.setAttribute("message",message);
            request.getRequestDispatcher("view/book/borrow.jsp").forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
