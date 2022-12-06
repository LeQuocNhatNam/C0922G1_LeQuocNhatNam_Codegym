package services.impl;

import controllers.FuramaController;
import models.person.Employee;
import services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void deleteEmployee(int employeeID) {
        Employee employeeDeleted = null;
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeID) {
                employeeDeleted = employee;
                break;
            }
        }
        employeeList.remove(employeeDeleted);
    }

    public boolean employeeExisted(int employeeID) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeID) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void setEmployeeName(int employeeEditedID, String name) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeEditedID) {
                employee.setName(name);
                break;
            }
        }
    }

    @Override
    public void setEmployeeDateOfBirth(int employeeEditedID, String newDateOfBirth) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeEditedID) {
                employee.setDateOfBirth(newDateOfBirth);
                break;
            }
        }
    }

    @Override
    public void setEmployeeGender(int employeeEditedId, String newGender) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeEditedId) {
                employee.setGender(newGender);
                break;
            }
        }
    }

    @Override
    public void setEmployeeIdentification(int employeeEditedId, String newIdentification) {
        for (Employee employee : employeeList){
            if (employee.getEmployeeID() == employeeEditedId){
                employee.setIdentification(newIdentification);
                break;
            }
        }
    }

    @Override
    public void setEmployeePhoneNumber(int employeeEditedId, String newPhoneNumber) {
        for (Employee employee : employeeList){
            if (employee.getEmployeeID() == employeeEditedId){
                employee.setPhoneNumber(newPhoneNumber);
                break;
            }
        }
    }

    @Override
    public void setEmployeeEmail(int employeeEditedId, String newEmail) {
        for (Employee employee:employeeList){
            if (employee.getEmployeeID() == employeeEditedId){
                employee.setEmail(newEmail);
                break;
            }
        }
    }

    @Override
    public void setEmployeeLevel(int employeeEditedId, String newLevel) {
        for (Employee employee:employeeList){
            if (employee.getEmployeeID() == employeeEditedId){
                employee.setLevel(newLevel);
                break;
            }
        }
    }

    @Override
    public void setEmployeePosition(int employeeEditedId, String newPosition) {
        for (Employee employee:employeeList){
            if (employee.getEmployeeID() == employeeEditedId){
                employee.setPosition(newPosition);
                break;
            }
        }
    }

    @Override
    public void setEmployeeSalary(int employeeEditedId, double newSalary) {
        for (Employee employee:employeeList){
            if (employee.getEmployeeID() == employeeEditedId){
                employee.setSalary(newSalary);
                break;
            }
        }
    }

    @Override
    public void editEmployee(int employeeID) {

    }


    @Override
    public List<Employee> getList() {
        return employeeList;
    }

    @Override
    public void addElement(Employee employee) {
        for (Employee e: employeeList){
            if (e.getEmployeeID() == employee.getEmployeeID()){
                System.out.println("already existed!");
                return;
            }
        }
        employeeList.add(employee);
    }


}
