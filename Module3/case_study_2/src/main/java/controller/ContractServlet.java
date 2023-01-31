package controller;

import model.contract.AttachFacility;
import model.contract.CustomerUsingService;
import service.contract.IContractService;
import service.contract.impl.ContractService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContractServlet", value = "/contract")
public class ContractServlet extends HttpServlet {
    private IContractService contractService = new ContractService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        String action = request.getParameter("action");
        if (action==null){
            action = "";
        }
        switch (action) {
            case "addAttachFacility":
                addAttachFacility(request,response);
                break;
            default:
                showList(request,response);
                break;
        }

    }

    private void addAttachFacility(HttpServletRequest request, HttpServletResponse response) {
        int attachFacilityId = Integer.parseInt(request.getParameter("attachFacilityId"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int contractId = Integer.parseInt(request.getParameter("contractId"));
        this.contractService.addAttachFacility(contractId,attachFacilityId,quantity);
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerUsingService> customerUsingServiceList = this.contractService.findCustomerUsingService();
        List<AttachFacility> attachFacilityList = this.contractService.findAllAttachFacility();
        try {
            request.setAttribute("attachFacilityList",attachFacilityList);
            request.setAttribute("customerUsingServiceList",customerUsingServiceList);
            request.getRequestDispatcher("view/contract/list.jsp").forward(request,response);
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
