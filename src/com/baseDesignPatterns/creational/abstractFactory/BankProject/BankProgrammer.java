package com.baseDesignPatterns.creational.abstractFactory.BankProject;

import com.baseDesignPatterns.creational.abstractFactory.Programmer;

public class BankProgrammer implements Programmer {
    @Override
    public void writeCode() {
        System.out.println("Bank coding");
    }
}
