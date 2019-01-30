class LazySingleton {


    //declaring the constructor private so that it can be accessed by other classes via a public method only
    private LazySingleton (){
    }

    //declaring a reference variable for singleton instance
    private static LazySingleton lazyInstance;

    public static void getObjectStatus() {
        System.out.println("Classname@hashcode before instantiation of Lazy Singleton Object: "+lazyInstance);
    }
    
    // a public class method to create a single instance of the this class
    public static LazySingleton getInstance(){
        if(lazyInstance == null)
        {
            lazyInstance = new LazySingleton();
        }
        return lazyInstance;
    }

    public static void main(String[] args) {
        //for Lazy instantiation
        LazySingleton.getObjectStatus();
        LazySingleton.getInstance();
        System.out.println("Classname@hashcode after instatiation of Lazy Singleton Object = " + lazyInstance);
        
    }
}