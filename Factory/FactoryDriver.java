public class FactoryDriver {
    public static void main(String[] args) {
        ComputerFactory compfac = new ComputerFactory();
        Computer comp1 = compfac.getType("PC");
        comp1.computerType();

        Computer comp2 = compfac.getType("Server");
        comp2.computerType();
    }
}