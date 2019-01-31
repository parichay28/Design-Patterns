public class ComputerFactory {
    public static Computer getComputer(String typeComputer){
        
         if(typeComputer.equalsIgnoreCase("PC")){
            return new PC();
        }
        else if(typeComputer.equalsIgnoreCase("Server")){
            return new Server();
        }

        else{
            return null;
        }
    }
}