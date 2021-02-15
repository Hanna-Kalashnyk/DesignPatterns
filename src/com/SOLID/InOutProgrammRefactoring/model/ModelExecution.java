package com.SOLID.InOutProgrammRefactoring.model;

import com.SOLID.InOutProgrammRefactoring.io.*;
import com.SOLID.InOutProgrammRefactoring.service.IService;

public class ModelExecution extends Model {
    IReader reader;
    IPrinter printer;
    IService serviceSum;
    IData data;

    public ModelExecution(IReader reader, IPrinter printer, IService serviceSum, IData data) {
        this.reader = reader;
        this.printer = printer;
        this.serviceSum = serviceSum;
        this.data = data;
    }

    public void execute() {
        Model model = new Model();
        model.init(data);
        model.cul(serviceSum);
        model.done(printer);
    }
}
