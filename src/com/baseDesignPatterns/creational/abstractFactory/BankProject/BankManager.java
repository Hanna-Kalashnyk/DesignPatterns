package com.baseDesignPatterns.creational.abstractFactory.BankProject;

import com.baseDesignPatterns.creational.abstractFactory.PManager;

public class BankManager implements PManager {
    @Override
    public void manage() {
        System.out.println("Bank Managing");
    }
}
