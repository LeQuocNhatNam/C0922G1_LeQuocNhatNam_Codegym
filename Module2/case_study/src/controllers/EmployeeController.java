package controllers;

import models.person.Employee;
import services.IEmployeeService;
import services.impl.EmployeeServiceImpl;

import java.util.List;
import java.util.Scanner;

public class EmployeeController {
    private IEmployeeService iEmployeeService = new EmployeeServiceImpl();

    public EmployeeController() {
    }

    public List<Employee> getListEmployees() {
        return this.iEmployeeService.getList();
    }

    public void addEmployees(Employee e) {
        this.iEmployeeService.addElement(e);

    }

    public void deleteEmployee(int employeeDeletedID) {
        iEmployeeService.deleteEmployee(employeeDeletedID);
    }

    public void editEmployee(int employeeEditedID) {
        iEmployeeService.editEmployee(employeeEditedID);
    }

    public boolean employeeExisted(int employeeEditedID) {
       return iEmployeeService.employeeExisted(employeeEditedID);
    }
}
