package com.baseDesignPatterns.creational.abstractFactory.webProject;

import com.baseDesignPatterns.creational.abstractFactory.PManager;
import com.baseDesignPatterns.creational.abstractFactory.Programmer;
import com.baseDesignPatterns.creational.abstractFactory.ProjectTeamFactory;
import com.baseDesignPatterns.creational.abstractFactory.Tester;

public class WebPTF implements ProjectTeamFactory {
    @Override
    public void announce() {
        System.out.println("Web   system is creating");
    }

    @Override
    public Programmer getProgrammer() {
        return new WebProgrammer();
    }

    @Override
    public Tester getTester() {
        return new WebTester();
    }

    @Override
    public PManager getPMeneger() {
        return new WebManager();
    }
}
