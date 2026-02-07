package design_pattern.singleton;


/*
*    if two threads comes at same time then for synchronized block only one thread will execute, and when threads
*    two coming it goes and seen the object is already being created. So it checks at two point that's why it's
*    called double checking locking.
*
*    We have different cors in OS. So each core has a separate cache memory called L1 Cache. and the caches has
* access to common memory. if both threads come parallel or not
*
* suppose only thread one is coming and perform the computation and stored in its cache. So the main memory has not been
  updated yet. and suppose the sync up between the two cache is not yet happening. now thread two is coming. it checks it
  L1 cache first finding null, then checking in memory also and find null also, and then it says null and created another objec
  So because of the caching two object is created.(without volatile)
* Volatiles purpose is that if you created any object volatile any read and write is always happening in memory
  not in the cache. So when the seperate thread works simultanously they do the operation in the memory, rather cache.
*/

public class SingletonWithDoubleCheckedLockingSystem {
    private static volatile SingletonWithDoubleCheckedLockingSystem conObject;

    private SingletonWithDoubleCheckedLockingSystem() {

    }

    public static SingletonWithDoubleCheckedLockingSystem getInstance() {
        if (conObject == null) {
            synchronized (SingletonWithDoubleCheckedLockingSystem.class) {
                if (conObject == null) {
                    conObject = new SingletonWithDoubleCheckedLockingSystem();
                }
            }
        }
        return conObject;
    }
}
