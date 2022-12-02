package services.impl;

import models.person.Employee;
import services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    @Override
    public void deleteEmployee(int employeeID) {
        for (Employee employee: employeeList){
            if (employee.getEmployeeID() == employeeID){
                employeeList.remove(employee);
            }
        }
    }

    @Override
    public void editEmployee(int employeeID) {

    }


    @Override
    public List<Employee> getList() {
        return null;
    }

    @Override
    public void addElement(Employee employee) {
        employeeList.add(employee);
    }


    @Override
    public void returnToMenu() {

    }
}
