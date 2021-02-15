package com.SOLID.InOutProgrammRefactoring;

import com.SOLID.InOutProgrammRefactoring.io.*;
import com.SOLID.InOutProgrammRefactoring.model.ModelExecution;
import com.SOLID.InOutProgrammRefactoring.service.IService;
import com.SOLID.InOutProgrammRefactoring.service.ServiceSum;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //File file = new File("file:///Users/nura/GitHub/DesignPatterns/src/com/SOLID/InOutProgrammRefactoring/number.txt");
        Scanner scanner = new Scanner(System.in);
        IReader reader = new ReaderConsole(scanner);
        IPrinter printer = new PrinterStars();
        IData data = new Data(reader, printer);
        IService serviceSum = new ServiceSum();
        ModelExecution modelExecution = new ModelExecution(reader, printer, serviceSum,data);
        modelExecution.execute();

    }
}
