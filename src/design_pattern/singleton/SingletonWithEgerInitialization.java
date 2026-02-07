package design_pattern.singleton;

/*
Eger Initialization means something like in advance.
 */


public class SingletonWithEgerInitialization {
    private static SingletonWithEgerInitialization conObject = new SingletonWithEgerInitialization();


    // this is why prevention of creating new object through a new keyword.
    private SingletonWithEgerInitialization() {

    }

    public static SingletonWithEgerInitialization getInstance() {
        return conObject;
    }
}
