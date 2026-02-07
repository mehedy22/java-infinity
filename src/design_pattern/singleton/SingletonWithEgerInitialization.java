package design_pattern.singleton;

/*
Eger Initialization means something like in advance.
Because as soon as when start the application all the static variable preloaded into the memory  ,
JVM loads the class, it creates an object of Singleton class.

so even though if we not using this, it's always created the object.
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
