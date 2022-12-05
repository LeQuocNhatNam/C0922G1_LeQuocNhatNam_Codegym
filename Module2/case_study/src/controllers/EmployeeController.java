package controllers;

import models.person.Employee;
import services.IEmployeeService;
import services.impl.EmployeeServiceImpl;

import java.util.List;

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

    public void setEmployeeName(int employeeEditedID, String newName) {

        iEmployeeService.setEmployeeName(employeeEditedID,newName);
    }

    public void setDateOfBirth(int employeeIDEdited, String newDateOfBirth) {
        iEmployeeService.setEmployeeDateOfBirth(employeeIDEdited,newDateOfBirth);
    }

    public void setEmployeeGender(int employeeEditedId, String newGender) {
        iEmployeeService.setEmployeeGender(employeeEditedId,newGender);

    }

    public void setEmployeeIdentification(int employeeEditedId, String newIdentification) {
        iEmployeeService.setEmployeeIdentification(employeeEditedId,newIdentification);

    }

    public void setEmployeePhoneNumber(int employeeEditedId, String newPhoneNumber) {
        iEmployeeService.setEmployeePhoneNumber(employeeEditedId,newPhoneNumber);
    }

    public void setEmployeeEmail(int employeeEditedId, String newEmail) {
        iEmployeeService.setEmployeeEmail(employeeEditedId,newEmail);

    }

    public void setEmployeeLevel(int employeeEditedId, String newLevel) {
        iEmployeeService.setEmployeeLevel(employeeEditedId,newLevel);

    }

    public void setEmployeePosition(int employeeEditedId, String newPosition) {
        iEmployeeService.setEmployeePosition(employeeEditedId,newPosition);

    }

    public void setEmployeeSalary(int employeeEditedId, double newSalary) {
        iEmployeeService.setEmployeeSalary(employeeEditedId,newSalary);

    }
}
