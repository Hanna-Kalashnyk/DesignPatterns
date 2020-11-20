package baseDesignPatterns.creational.abstractFactory.webProject;

import baseDesignPatterns.creational.abstractFactory.PManager;
import baseDesignPatterns.creational.abstractFactory.Programmer;
import baseDesignPatterns.creational.abstractFactory.ProjectTeamFactory;
import baseDesignPatterns.creational.abstractFactory.Tester;

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
