package services.impl;

import models.person.Employee;
import services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

import static utils.read_and_write_file_employee.ReadFileEmployee.readFile;
import static utils.read_and_write_file_employee.WriteFileEmployee.writeFile;

public class EmployeeServiceImpl implements IEmployeeService {

    private static List<Employee> employeeList = new ArrayList<>();
    private final static String EMPLOYEE_PATH_NAME = "src/datas/employee.csv";

    @Override
    public void deleteEmployee(int employeeID) {
        employeeList = readFile(EMPLOYEE_PATH_NAME);

        if (employeeList.isEmpty()) {
            System.out.println("empty list!");
            return;
        }

        if (!employeeExisted(employeeID)) {
            System.out.println("not existed!");
            return;
        }
        Employee employeeDeleted = null;
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeID) {
                employeeDeleted = employee;
                break;
            }
        }
        employeeList.remove(employeeDeleted);
        writeFile(EMPLOYEE_PATH_NAME,employeeList);
        System.out.println("Deleted successfully!");
    }

    public boolean employeeExisted(int employeeID) {
        employeeList = readFile(EMPLOYEE_PATH_NAME);
        if (employeeList.isEmpty()) {
            return false;
        }
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
        writeFile(EMPLOYEE_PATH_NAME,employeeList);
    }

    @Override
    public void setEmployeeDateOfBirth(int employeeEditedID, String newDateOfBirth) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeEditedID) {
                employee.setDateOfBirth(newDateOfBirth);
                break;
            }
        }
        writeFile(EMPLOYEE_PATH_NAME,employeeList);
    }

    @Override
    public void setEmployeeGender(int employeeEditedId, String newGender) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeEditedId) {
                employee.setGender(newGender);
                break;
            }
        }
        writeFile(EMPLOYEE_PATH_NAME,employeeList);
    }

    @Override
    public void setEmployeeIdentification(int employeeEditedId, String newIdentification) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeEditedId) {
                employee.setIdentification(newIdentification);
                break;
            }
        }
        writeFile(EMPLOYEE_PATH_NAME,employeeList);
    }

    @Override
    public void setEmployeePhoneNumber(int employeeEditedId, String newPhoneNumber) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeEditedId) {
                employee.setPhoneNumber(newPhoneNumber);
                break;
            }
        }
        writeFile(EMPLOYEE_PATH_NAME,employeeList);
    }

    @Override
    public void setEmployeeEmail(int employeeEditedId, String newEmail) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeEditedId) {
                employee.setEmail(newEmail);
                break;
            }
        }
        writeFile(EMPLOYEE_PATH_NAME,employeeList);
    }

    @Override
    public void setEmployeeLevel(int employeeEditedId, String newLevel) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeEditedId) {
                employee.setLevel(newLevel);
                break;
            }
        }
        writeFile(EMPLOYEE_PATH_NAME,employeeList);
    }

    @Override
    public void setEmployeePosition(int employeeEditedId, String newPosition) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeEditedId) {
                employee.setPosition(newPosition);
                break;
            }
        }
        writeFile(EMPLOYEE_PATH_NAME,employeeList);
    }

    @Override
    public void setEmployeeSalary(int employeeEditedId, double newSalary) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeEditedId) {
                employee.setSalary(newSalary);
                break;
            }
        }
        writeFile(EMPLOYEE_PATH_NAME,employeeList);
    }

    @Override
    public void editEmployee(int employeeID) {

    }


    @Override
    public List<Employee> getList() {
        employeeList = readFile(EMPLOYEE_PATH_NAME);
        return employeeList;
    }

    @Override
    public void addElement(Employee employee) {
        employeeList = readFile(EMPLOYEE_PATH_NAME);
        if (employeeExisted(employee.getEmployeeID())) {
            System.out.println("Already existed!");
            return;
        }
        employeeList.add(employee);
        writeFile(EMPLOYEE_PATH_NAME, employeeList);
        System.out.println("successfully added!");
    }





}
