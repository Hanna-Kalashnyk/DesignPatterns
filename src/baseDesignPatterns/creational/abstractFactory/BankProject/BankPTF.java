package baseDesignPatterns.creational.abstractFactory.BankProject;

import baseDesignPatterns.creational.abstractFactory.PManager;
import baseDesignPatterns.creational.abstractFactory.Programmer;
import baseDesignPatterns.creational.abstractFactory.ProjectTeamFactory;
import baseDesignPatterns.creational.abstractFactory.Tester;
import baseDesignPatterns.creational.abstractFactory.webProject.WebManager;

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
