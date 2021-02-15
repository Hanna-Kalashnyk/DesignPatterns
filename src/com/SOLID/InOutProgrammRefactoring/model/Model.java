package com.SOLID.InOutProgrammRefactoring.model;

import com.SOLID.InOutProgrammRefactoring.io.IData;
import com.SOLID.InOutProgrammRefactoring.io.IPrinter;
import com.SOLID.InOutProgrammRefactoring.service.IService;

public class Model {
    int a, b, sum;

    public void init(IData data) {
        data.input("Input a:");
        data.input("Input b:");
    }

    public void cul(IService serviceSum) {
         sum = serviceSum.calculate(a,b);
    }

    public void done(IPrinter printer) {
        printer.print("Result: ");
        printer.print(sum);

    }
}
