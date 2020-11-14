package single;

public class Main {
    public static void main(String[] args) {

        // We all know that in Java if the two objects are same then,
        // their hash key have to be equal. Let’s test that.
        // If the above singleton is correctly implemented than below code should return the same hash key.


        Lazy instance = Lazy.getInstance();
        Lazy instance1 = Lazy.getInstance() ;

        //now lets check the hash key.
        System.out.println("Instance 1 hash:" + instance.hashCode());
        System.out.println("Instance 2 hash:" + instance1.hashCode());

    }
}
