package single;
// Singletons are often useful where
// we have to control the resources, such as database connections or sockets.


public class Eager {

    //In eager initialization, the instance of Singleton Class is created at the time of class loading,
    // this is the easiest method to create a singleton class.
    public static final Eager instance = new Eager();


    //By making the constructor as private we are not allowing other class to create a new instance
    // of the class we want to create the singleton
    private Eager(){  }


    //By making the constructor as private we are not allowing other class to create a new instance
    // of the class we want to create the singleton.
    // Instead, we are creating one public static method (commonly name as for getInstance())
    // to provide the single entry point to create the new instance of the class.
    public static Eager getInstance(){
        return instance ;
    }




}
