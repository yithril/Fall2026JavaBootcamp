package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = FileManager.readEmployees();

        Employee employee = new Employee(90, "Bob Jones", 35.5f, 20.5);

        FileManager.writeEmployee(employee);
    }
}