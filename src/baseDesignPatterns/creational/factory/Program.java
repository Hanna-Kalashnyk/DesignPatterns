package baseDesignPatterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        Developer dev = new JavaDev();
        dev.writeCode();

        dev = new CppDev();
        dev.writeCode();
    }
}
