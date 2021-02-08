package com.SOLID.SRP.employee;

public class EmployeeOutputFormatter extends OutputFormatter{
    public EmployeeOutputFormatter(Object object, FormatType formatType){
        super(object,  formatType);
    }
public String getFormattedEmployee(){
    return output;}
}

