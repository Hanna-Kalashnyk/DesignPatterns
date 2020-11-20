package baseDesignPatterns.creational.abstractFactory.webProject;

import baseDesignPatterns.creational.abstractFactory.Programmer;

public class WebProgrammer implements Programmer {
    @Override
    public void writeCode() {
        System.out.println("web-programmer writes the code");
    }
}
