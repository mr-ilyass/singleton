package single;
//Opposite to Eager initialization, We are going to initialize new instance of the class in getInstance() method it self

public class Lazy {

    private static Lazy instance;

    private Lazy(){}


    //This method will check if there is any instance of that class is already created? If yes,
    // then our method (getInstance()) will return that old instance and if not then it creates a new instance of the singleton class in JVM and returns that instance

    public static Lazy getInstance(){
        if (instance == null){ //if there is no instance available... we ll create new one
            instance = new Lazy();
        }
        return instance;
    }

}
