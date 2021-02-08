package com.SOLID.SRP.employee;

public class OutputFormatter {
    String output;
    public OutputFormatter(Object object, FormatType formatType){
        switch (formatType){
            case XML:
                output = XMLConverter(object);
                break;
            case CSV:
                output = CSVConverter(object);
                break;
        }
    }
    public String XMLConverter (Object object){
        return "converted to XML"   + object.toString();
    }
    public String CSVConverter (Object object){
        return "converted to CSV " + object.toString();
    }
}
