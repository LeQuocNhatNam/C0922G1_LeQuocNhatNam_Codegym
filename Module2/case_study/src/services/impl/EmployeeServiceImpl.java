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

    public boolean employeeExisted(int employeeID){
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeID) {
                return true;
            }
        }return false;
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
        employeeList.add(employee);
    }


    @Override
    public void returnToMenu() {
        new FuramaController().displayMainMenu();
    }
}
