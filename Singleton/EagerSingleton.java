class EagerSingleton {


    //declaring the constructor private so that it can be accessed by other classes via a public method only
    private EagerSingleton (){}

    //declaring a reference variable for singleton instance
    private static EagerSingleton eagerInstance = new EagerSingleton();

    public static void getObjectStatus() {
        System.out.println("Classname@hashcode before instantiation of Eager Singleton Object: "+eagerInstance);
    }
    
    // a public class method to create a single instance of the this class
    public static EagerSingleton getInstance(){
        return eagerInstance;
    }

    public static void main(String[] args) {
        //for Eager instantiation
        EagerSingleton.getObjectStatus();
        EagerSingleton.getInstance();
        System.out.println("Classname@hashcode after instatiation of Eager Singleton Object = " + eagerInstance);
    }
}