package com.SOLID.SRP.employee;

public class ClientModule {
    public static void main(String[] args) {
        Employee leon = new Employee(1,"Leon","Sales",true);
        ClientModule.hairEmployee(leon);
        ClientModule.printEmployeeOutput(leon, FormatType.XML);
        ClientModule.printEmployeeOutput(leon, FormatType.CSV);
    }
    public static void printEmployeeOutput(Employee employee,FormatType formatType){
        EmployeeOutputFormatter employeeOutputFormatter = new EmployeeOutputFormatter(employee, formatType);
        System.out.println(employeeOutputFormatter.getFormattedEmployee()
        );
    }

    public static void hairEmployee(Employee employee){
       EmployeeDAO employeeDAO= new EmployeeDAO();
       employeeDAO.saveEmployee(employee);
    }

    public static void fireEmployee(Employee employee){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }
}
