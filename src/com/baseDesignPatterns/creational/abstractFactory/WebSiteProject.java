package com.baseDesignPatterns.creational.abstractFactory;

import com.baseDesignPatterns.creational.abstractFactory.BankProject.BankPTF;
import com.baseDesignPatterns.creational.abstractFactory.webProject.WebPTF;

public class WebSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebPTF();

        projectBuilding(projectTeamFactory);

         projectTeamFactory = new BankPTF();
        projectBuilding(projectTeamFactory);
    }

    private static void projectBuilding(ProjectTeamFactory projectTeamFactory) {
        projectTeamFactory.announce();
        PManager pManager = projectTeamFactory.getPMeneger();
        Programmer programmer = projectTeamFactory.getProgrammer();
        Tester tester = projectTeamFactory.getTester();

        pManager.manage();
        programmer.writeCode();
        tester.test();
    }
}
