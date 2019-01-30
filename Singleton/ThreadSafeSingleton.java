class ThreadSafeSingleton{


    //declaring the constructor private so that it can be accessed by other classes via a public method only
    //declaring a reference variable for singleton instance
    private static ThreadSafeSingleton threadSafeInstance;

    private ThreadSafeSingleton(){}

    public static void getObjectStatus() {
        System.out.println("Message before instantiation of Thread Safe Singleton Object: "+threadSafeInstance);
    }

 
    // a public class method to create a single instance of the this class
    public static ThreadSafeSingleton getInstance(){

        if(threadSafeInstance == null){
            synchronized (ThreadSafeSingleton.class){
                if(threadSafeInstance == null){
                    threadSafeInstance = new ThreadSafeSingleton();
                }

            }
        }
        
        return threadSafeInstance;
    }
    

    
}