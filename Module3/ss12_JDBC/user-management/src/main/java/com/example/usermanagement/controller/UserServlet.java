package com.example.usermanagement.controller;

import com.example.usermanagement.dao.UserDAO;
import com.example.usermanagement.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "UserServlet", value = "/users")
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDAO userDAO;

    public void init() {
        userDAO = new UserDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showNewForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                deleteUser(request, response);
                break;
            case "sort":
                sortByName(request, response);
                break;
            case "permission":
                addUserPermission(request,response);
                break;
            case "test-without-tran":
                testWithoutTran(request,response);
                break;
            case "test-use-tran":
                testUseTran(request,response);
                break;
            default:
                listUser(request, response);
                break;

        }
    }

    private void testUseTran(HttpServletRequest request, HttpServletResponse response) {
        this.userDAO.insertUpdateUseTransaction();
    }

    private void testWithoutTran(HttpServletRequest request, HttpServletResponse response) {
        this.userDAO.insertUpdateWithoutTransaction();
    }

    private void addUserPermission(HttpServletRequest request, HttpServletResponse response) {
        User user = new User("namLe","Namle.nguyen@codegym.vn","vn");
        int[] permissions = {1,2,4};
        this.userDAO.addUserTransaction(user,permissions);
    }

    private void sortByName(HttpServletRequest request, HttpServletResponse response) {
        List<User> list = this.userDAO.sortByName();
        request.setAttribute("message","Done sorting!");
        request.setAttribute("userList",list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/sorted_list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void searchByCountry(HttpServletRequest request, HttpServletResponse response) {
        List<User> list = new ArrayList<>();
        String country = request.getParameter("country");
        list = this.userDAO.searchByCountry(country);
        request.setAttribute("userList", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/search_by_country.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            this.userDAO.deleteUser(id);
            response.sendRedirect("/users");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
//        User existingUser = this.userDAO.selectUser(id);
        User existingUser = this.userDAO.getUserById(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/edit.jsp");
        request.setAttribute("user", existingUser);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void listUser(HttpServletRequest request, HttpServletResponse response) {
        List<User> userList = this.userDAO.getAllUsers();
        request.setAttribute("listUser", userList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/list.jsp");
        try {
            requestDispatcher.forward(request, response);
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
            case "create":
                insertUser(request, response);
                break;
            case "edit":
                updateUser(request, response);
                break;
            case "searchByCountry":
                searchByCountry(request, response);
                break;
            case "searchByName":
                searchByName(request,response);
                break;
        }
    }

    private void searchByName(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        List<User> list = this.userDAO.searchByName(name);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/search_by_name.jsp");
        request.setAttribute("userList",list);
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void updateUser(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User book = new User(id, name, email, country);
        try {
            this.userDAO.updateUser(book);
            request.setAttribute("message", "Successfully edited");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/edit.jsp");
            requestDispatcher.forward(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void insertUser(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User newUser = new User(name, email, country);
        try {
//            userDAO.insertUser(newUser);
            this.userDAO.insertUser(newUser);
            request.setAttribute("message", "Successfully added!");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/create.jsp");
            requestDispatcher.forward(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
