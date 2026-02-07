package design_pattern.singleton;


/*
 Bill Pugh Solution actually improves the Eger Initialization. The disadvantage of Bill Pugh Solution is
 that even the class is not used object is created at every time. So bill pugh resolves that problems only.



 */
public class SingletonWithBillPughSolution {


    private SingletonWithBillPughSolution() {

    }

    /*
        By using nested class it doesn't load at the time of the application start. All the nested static class dont
        get loaded until the first time it is called. So whenever it is used then it's loaded into memory.

    */

    private static class SingletonHolder {
        private static final SingletonWithBillPughSolution INSTANCE = new SingletonWithBillPughSolution();
    }

    public static SingletonWithBillPughSolution getInstance() {
        return SingletonHolder.INSTANCE;
    }


}
