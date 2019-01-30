class ThreadSafeSingletonDriver extends Thread{


    public void run() {
        System.out.println("Thread Name: "+ this.getName());
        ThreadSafeSingleton.getObjectStatus();
        System.out.println("Msg after instatiation of Thread Safe Singleton Object = " + ThreadSafeSingleton.getInstance());
    } 
    
    public static void main(String[] args) {
        ThreadSafeSingletonDriver t1 = new ThreadSafeSingletonDriver(); 
        ThreadSafeSingletonDriver t2 = new ThreadSafeSingletonDriver(); 

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();

        
    }
}