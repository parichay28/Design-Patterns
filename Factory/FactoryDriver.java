public class FactoryDriver {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC");
        pc.computerType();

        Computer server = ComputerFactory.getComputer("Server");
        server.computerType();
    }
}