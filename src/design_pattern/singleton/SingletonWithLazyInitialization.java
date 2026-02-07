package design_pattern.singleton;

/*
*  So here before creating the object the connection object is checked for the very first time it is assigned or not
* not thread safe, if two thread works at same time then it makes troubles.
*
* */

public class SingletonWithLazyInitialization {
    private static SingletonWithLazyInitialization conObject;

    private SingletonWithLazyInitialization() {

    }

    public static SingletonWithLazyInitialization getInstance() {
        if (conObject == null) {
            conObject = new SingletonWithLazyInitialization();
        }
        return conObject;
    }
}
