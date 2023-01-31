package controller;

import model.customer.Customer;
import model.customer.CustomerType;
import service.customer.ICustomerService;
import service.customer.ICustomerTypeService;
import service.customer.impl.CustomerService;
import service.customer.impl.CustomerTypeService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    private ICustomerService customerService = new CustomerService();
    private ICustomerTypeService customerTypeService = new CustomerTypeService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            default:
                showList(request, response);
                break;
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("deletedId"));
        String message = "Successfully deleted!";
        if (!this.customerService.deleteCustomerById(id)) {
            message = "Fail! Please try again!";
        }
        request.setAttribute("message",message);
        showList(request,response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerService.getCustomerById(id);
        request.setAttribute("customer",customer);
        request.setAttribute("customerTypeList",this.customerTypeService.findAll());
        try {
            request.getRequestDispatcher("view/customer/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        List<LocalDate> dateValidateList = this.customerService.getDateValidate();
        request.setAttribute("dateValidateList",dateValidateList);
        List<CustomerType> customerTypeList = this.customerTypeService.findAll();
        request.setAttribute("customerTypeList", customerTypeList);
        try {
            request.getRequestDispatcher("view/customer/create.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = this.customerService.findAll();
        try {
            request.setAttribute("customerList", customerList);
            request.getRequestDispatcher("view/customer/list.jsp").forward(request, response);
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
                createCustomer(request, response);
                break;
            case "edit":
                editCustomer(request,response);
            default:
                break;
        }
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        int customerTypeId = Integer.parseInt(request.getParameter("customerTypeId"));
        String name = request.getParameter("name");
        Date dateOfBirth = Date.valueOf(request.getParameter("dateOfBirth"));
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(id,customerTypeId,name,dateOfBirth,gender,idCard,phoneNumber,email,address);
        String message = "Successfully edited!";
        if (this.customerService.updateCustomer(customer)) {
            request.setAttribute("message",message);
        } else {
            message = "Sorry! Fail to update!";
            request.setAttribute(message,message);
        }
        try {
            request.getRequestDispatcher("view/customer/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        int customerTypeId = Integer.parseInt(request.getParameter("customerTypeId"));
        String name = request.getParameter("name");
        Date dateOfBirth = Date.valueOf(request.getParameter("dateOfBirth"));
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(customerTypeId,name,dateOfBirth,gender,idCard,phoneNumber,email,address);
        String message = "";
        if (this.customerService.saveCustomer(customer)) {
            message = "Successfully added";
        } else {

        }
        request.setAttribute("message",message);
        try {
            request.getRequestDispatcher("view/customer/create.jsp").forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
