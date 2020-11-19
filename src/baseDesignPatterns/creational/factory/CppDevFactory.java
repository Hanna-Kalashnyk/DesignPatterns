package baseDesignPatterns.creational.factory;

public class CppDevFactory implements DevFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDev();
    }
}
