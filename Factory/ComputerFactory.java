public class ComputerFactory {
    public Computer getType(String typeComputer){
        if (typeComputer == null){
            return null;
        }
        else if(typeComputer.equalsIgnoreCase("PC")){
            return new PC();
        }
        else if(typeComputer.equalsIgnoreCase("Server")){
            return new Server();
        }
        return null;
    }
}