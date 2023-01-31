package controller;

import model.customer.Customer;
import service.customer.ICustomerService;
import service.customer.impl.CustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerContractServlet", value = "/customerContract")
public class CustomerContractServlet extends HttpServlet {
    private ICustomerService customerService = new CustomerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "search" :
                break;
            default:
                showList(request,response);
                break;
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerContractList = this.customerService.findAllCustomerContract();
        try {
            request.setAttribute("customerContractList",customerContractList);
            request.getRequestDispatcher("view/customer/using_service.jsp").forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
