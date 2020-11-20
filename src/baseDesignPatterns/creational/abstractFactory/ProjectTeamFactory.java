package baseDesignPatterns.creational.abstractFactory;

public interface ProjectTeamFactory {
    Programmer getProgrammer();

    Tester getTester();

    PManager getPMeneger();

    void announce();
}

