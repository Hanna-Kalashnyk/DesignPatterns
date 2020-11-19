package baseDesignPatterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        DevFactory devFactory = DevFactoryDirector("java");
        Developer dev = devFactory.createDeveloper();
        dev.writeCode();

        DevFactory cppFactory = DevFactoryDirector("cpp");
        Developer cppdev = cppFactory.createDeveloper();
        cppdev.writeCode();

        DevFactory vvvFactory = DevFactoryDirector("vvv");
        Developer vvvdev = vvvFactory.createDeveloper();
        vvvdev.writeCode();
    }

    static DevFactory DevFactoryDirector(String factorySpesification) {
        if (factorySpesification.equalsIgnoreCase("java"))
            return new JavaDevFactory();
        else if (factorySpesification.equalsIgnoreCase("cpp"))
            return new CppDevFactory();
        else throw new RuntimeException(factorySpesification + " is unknown program specification");
    }
}
