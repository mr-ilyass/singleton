package single;

public class ThreadSafe {
    private static ThreadSafe instance;

    private ThreadSafe() {
    }


    //  getInstance() method is made synchronized so that multiple threads can’t access it simultaneously
    
    public static synchronized ThreadSafe getInstance() {
        if (instance == null)
            instance = new ThreadSafe();
        return instance;
    }
}
