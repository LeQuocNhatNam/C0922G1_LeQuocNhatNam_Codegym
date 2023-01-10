package controller;

import model.facility.Facility;
import model.facility.FacilityType;
import model.facility.RentType;
import service.facility.IFacilityService;
import service.facility.IFacilityTypeService;
import service.facility.IRentTypeService;
import service.facility.impl.FacilityService;
import service.facility.impl.FacilityTypeService;
import service.facility.impl.RentTypeService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FacilityServLet", value = "/facility")
public class FacilityServlet extends HttpServlet {
    private IRentTypeService rentTypeService = new RentTypeService();
    private IFacilityService facilityService = new FacilityService();
    private IFacilityTypeService facilityTypeService = new FacilityTypeService();

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
            case "details":
                break;
            case "delete":
                deleteFacility(request, response);
                break;
            default:
                showList(request, response);
                break;
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Facility facility = this.facilityService.findFacilityById(id);
        List<RentType> rentTypeList = this.rentTypeService.findAll();
        request.setAttribute("facility", facility);
        request.setAttribute("rentTypeList", rentTypeList);
        try {
            request.getRequestDispatcher("view/facility/edit.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        String type = request.getParameter("type");
        List<RentType> rentTypeList = this.rentTypeService.findAll();
        List<FacilityType> facilityTypeList = this.facilityTypeService.findAll();
        request.setAttribute("facilityTypeList", facilityTypeList);
        request.setAttribute("rentTypeList", rentTypeList);
        try {
            request.getRequestDispatcher("view/facility/create.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        switch (type) {
//            case "villa":
//                try {
//                    request.getRequestDispatcher("view/facility/create_villa.jsp").forward(request, response);
//                } catch (ServletException e) {
//                    throw new RuntimeException(e);
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//                break;
//            case "house":
//                try {
//                    request.getRequestDispatcher("/view/facility/create_house.jsp").forward(request, response);
//                } catch (ServletException e) {
//                    throw new RuntimeException(e);
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//                break;
//            case "room":
//                try {
//                    request.getRequestDispatcher("/view/facility/create_room.jsp").forward(request, response);
//                } catch (ServletException e) {
//                    throw new RuntimeException(e);
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//                break;
//        }

    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<Facility> facilityList = this.facilityService.findAll();
        request.setAttribute("facilityList", facilityList);
        List<FacilityType> facilityTypeList = this.facilityTypeService.findAll();
        request.setAttribute("facilityTypeList", facilityTypeList);
        try {
            request.getRequestDispatcher("view/facility/list.jsp").forward(request, response);
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
                createFacility(request, response);
                break;
            case "createVilla":
                createVilla(request, response);
                break;
            case "createHouse":
                createHouse(request, response);
                break;
            case "createRoom":
                createRoom(request, response);
                break;
            case "edit":
                editFacility(request, response);
                break;
            case "search":
                searchFacility(request, response);
                break;
            default:
                break;
        }
    }

    private void createFacility(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        int area = Integer.parseInt(request.getParameter("area"));
        double cost = Double.parseDouble(request.getParameter("cost"));
        int maxPeople = Integer.parseInt(request.getParameter("maxPeople"));
        int rentTypeId = Integer.parseInt(request.getParameter("rentTypeId"));
        int facilityTypeId = Integer.parseInt(request.getParameter("facilityTypeId"));
        String standardRoom = request.getParameter("standardRoom");
        String otherConvenience = request.getParameter("otherConvenience");
        double poolArea;
        if (request.getParameter("poolArea") == null) {
            poolArea = 0;
        } else {
            poolArea = Double.parseDouble(request.getParameter("poolArea"));
        }
        int numberOfFloors;
        if (request.getParameter("numberOfFloors")==null){
            numberOfFloors = 0;
        } else {
            numberOfFloors = Integer.parseInt(request.getParameter("numberOfFloors"));
        }
        String freeFacility = request.getParameter("freeFacility");
        Facility facility = new Facility(name, area, cost, maxPeople, rentTypeId, facilityTypeId, standardRoom,
                otherConvenience, poolArea, numberOfFloors, freeFacility);
        String message = "Successfully added!";
        if (!this.facilityService.saveFacility(facility)) {
            message = "Fail to create";
        }
        request.setAttribute("message", message);
        try {
            request.getRequestDispatcher("view/facility/create.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void searchFacility(HttpServletRequest request, HttpServletResponse response) {
        int facilityTypeIdSearch = Integer.parseInt(request.getParameter("facilityTypeIdSearch"));
        String nameSearch = request.getParameter("nameSearch");
        List<Facility> facilitySearchList = this.facilityService.searchFacility(facilityTypeIdSearch, nameSearch);
        request.setAttribute("facilitySearchList", facilitySearchList);
        try {
            request.getRequestDispatcher("view/facility/list_search.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void deleteFacility(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("deletedId"));
        String message = "Successfully deleted!";
        if (!this.facilityService.deleteFacility(id)) {
            message = "Fail to delete!";
        }
        request.setAttribute("message", message);
        showList(request, response);
    }

    private void editFacility(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int area = Integer.parseInt(request.getParameter("area"));
        double cost = Double.parseDouble(request.getParameter("cost"));
        int maxPeople = Integer.parseInt(request.getParameter("maxPeople"));
        int rentTypeId = Integer.parseInt(request.getParameter("rentTypeId"));
        int facilityTypeId = Integer.parseInt(request.getParameter("facilityTypeId"));
        String standardRoom = request.getParameter("standardRoom");
        String otherConvenience = request.getParameter("otherConvenience");
        double poolArea;
        if (facilityTypeId == 3) {
            poolArea = 0;
        } else {
            poolArea = Double.parseDouble(request.getParameter("poolArea"));
        }
        int numberOfFloors;
        if (facilityTypeId != 3) {
            numberOfFloors = Integer.parseInt(request.getParameter("numberOfFloors"));
        } else {
            numberOfFloors = 0;
        }
        String freeFacility = request.getParameter("freeFacility");
        Facility facility = new Facility(id, name, area, cost, maxPeople, rentTypeId, facilityTypeId, standardRoom,
                otherConvenience, poolArea, numberOfFloors, freeFacility);
        String message = "Successfully edited!";
        if (!this.facilityService.updateFacility(facility)) {
            message = "Fail to edit!";
        }
        request.setAttribute("message", message);
        try {
            request.getRequestDispatcher("view/facility/edit.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void createRoom(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        int area = Integer.parseInt(request.getParameter("area"));
        double cost = Double.parseDouble(request.getParameter("cost"));
        int maxPeople = Integer.parseInt(request.getParameter("maxPeople"));
        int rentTypeId = Integer.parseInt(request.getParameter("rentTypeId"));
        int facilityTypeId = Integer.parseInt(request.getParameter("facilityTypeId"));
        String freeFacility = request.getParameter("freeFacility");
        Facility facility = new Facility(name, area, cost, maxPeople, rentTypeId, facilityTypeId, freeFacility);
        String message = "Successfully added!";
        if (!this.facilityService.saveFacility(facility)) {
            message = "Fail to create this Villa";
        }
        request.setAttribute("message", message);
        try {
            request.getRequestDispatcher("view/facility/create_room.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void createHouse(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        int area = Integer.parseInt(request.getParameter("area"));
        double cost = Double.parseDouble(request.getParameter("cost"));
        int maxPeople = Integer.parseInt(request.getParameter("maxPeople"));
        int rentTypeId = Integer.parseInt(request.getParameter("rentTypeId"));
        int facilityTypeId = Integer.parseInt(request.getParameter("facilityTypeId"));
        String standardRoom = request.getParameter("standardRoom");
        String otherConvenience = request.getParameter("otherConvenience");
        double poolArea = Double.parseDouble(request.getParameter("poolArea"));
        int numberOfFloors = Integer.parseInt(request.getParameter("numberOfFloors"));
        Facility facility = new Facility(name, area, cost, maxPeople, rentTypeId, facilityTypeId, standardRoom,
                otherConvenience, poolArea, numberOfFloors);
        String message = "Successfully added!";
        if (!this.facilityService.saveFacility(facility)) {
            message = "Fail to create this Villa";
        }
        request.setAttribute("message", message);
        try {
            request.getRequestDispatcher("view/facility/create_villa.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void createVilla(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        int area = Integer.parseInt(request.getParameter("area"));
        double cost = Double.parseDouble(request.getParameter("cost"));
        int maxPeople = Integer.parseInt(request.getParameter("maxPeople"));
        int rentTypeId = Integer.parseInt(request.getParameter("rentTypeId"));
        int facilityTypeId = Integer.parseInt(request.getParameter("facilityTypeId"));
        String standardRoom = request.getParameter("standardRoom");
        String otherConvenience = request.getParameter("otherConvenience");
        double poolArea = Double.parseDouble(request.getParameter("poolArea"));
        int numberOfFloors = Integer.parseInt(request.getParameter("numberOfFloors"));
        String freeFacility = request.getParameter("freeFacility");
        Facility facility = new Facility(name, area, cost, maxPeople, rentTypeId, facilityTypeId, standardRoom,
                otherConvenience, poolArea, numberOfFloors, freeFacility);
        String message = "Successfully added!";
        if (!this.facilityService.saveFacility(facility)) {
            message = "Fail to create this Villa";
        }
        request.setAttribute("message", message);
        try {
            request.getRequestDispatcher("view/facility/create_villa.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
