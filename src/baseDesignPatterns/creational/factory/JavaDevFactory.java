package baseDesignPatterns.creational.factory;

public class JavaDevFactory implements DevFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDev();
    }
}
