package design_pattern.singleton;

public class SingletonWithSynchronizedMethod {
    private static SingletonWithSynchronizedMethod conObject;


    private SingletonWithSynchronizedMethod() {

    }

    /*
    *  Here this synchronized keyword does two things
    * First put a lock and also do unlocking
    * if two threads go at same times then only on thread with works.

    * The problem is by using synchronized at method level, it becomes very slow. if we are calling getInstance() method
     in many places then id frequently do lock and unlock thats why it will take a lot of time to execute
    * */

    public static synchronized SingletonWithSynchronizedMethod getInstance() {
        if (conObject == null) {
            conObject = new SingletonWithSynchronizedMethod();
        }
        return conObject;
    }
}
