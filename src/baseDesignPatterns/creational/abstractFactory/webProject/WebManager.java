package baseDesignPatterns.creational.abstractFactory.webProject;

import baseDesignPatterns.creational.abstractFactory.PManager;

public class WebManager implements PManager {
    @Override
    public void manage() {
        System.out.println("web-manager manages  the Web project");
    }
}
