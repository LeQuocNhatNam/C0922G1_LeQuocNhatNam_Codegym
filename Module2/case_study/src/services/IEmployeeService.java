package services;

import models.person.Employee;

public interface IEmployeeService extends IService<Employee> {


    void deleteEmployee(int employeeID);

    void editEmployee(int employeeID);

    boolean employeeExisted(int employeeID);

}
