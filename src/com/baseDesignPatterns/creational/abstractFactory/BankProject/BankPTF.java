package com.baseDesignPatterns.creational.abstractFactory.BankProject;

import com.baseDesignPatterns.creational.abstractFactory.PManager;
import com.baseDesignPatterns.creational.abstractFactory.Programmer;
import com.baseDesignPatterns.creational.abstractFactory.ProjectTeamFactory;
import com.baseDesignPatterns.creational.abstractFactory.Tester;
import com.baseDesignPatterns.creational.abstractFactory.webProject.WebManager;

public class BankPTF implements ProjectTeamFactory {
    @Override
    public void announce() {
        System.out.println("Bank   system is creating");
    }

    @Override
    public Programmer getProgrammer() {
        return new BankProgrammer();
    }

    @Override
    public Tester getTester() {
        return new BankTester();
    }

    @Override
    public PManager getPMeneger() {
        return new WebManager();
    }
}
