package com.SOLID.SRP.employee;

public class EmployeeDAO {
    public void saveEmployee (Employee employee){
        System.out.println("saving of employee " + employee);
    }
    public void deleteEmployee (Employee employee){
        System.out.println("deletion of employee " + employee);
    }
}
