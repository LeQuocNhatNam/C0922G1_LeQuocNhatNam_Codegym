package controller;

import model.BookCard;
import repository.IBookCardRepository;
import repository.impl.BookCardRepository;
import service.IBookCardService;
import service.impl.BookCardService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BookCardServlet", value = "/bookCard")
public class BookCardServlet extends HttpServlet {
    private IBookCardService bookCardService = new BookCardService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "search":

                break;
            default:
                showList(request,response);
                break;
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<BookCard> bookCardList = this.bookCardService.findAll();
        request.setAttribute("bookCardList",bookCardList);
        try {
            request.getRequestDispatcher("view/book/borrowList.jsp").forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookSearch = request.getParameter("bookSearch");
        String studentSearch = request.getParameter("studentSearch");
        List<BookCard> bookCardList = this.bookCardService.findSearch(bookSearch,studentSearch);
        request.setAttribute("bookCardList",bookCardList);
        request.getRequestDispatcher("view/book/borrowList.jsp").forward(request,response);

    }
}
