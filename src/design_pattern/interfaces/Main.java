package design_pattern.interfaces;

/*
 * interface can use as a data type also.
 * all methods are implicit public only.
 * method can't be declared as final.
 * fields are public, static and final implicitly.
 * can't make field private or protected.
 *
 */
public class Main {

    public static void main(String[] args) {

        Bird bird = new Eagle();
        Bird bird1 = new Hen();


        bird.fly();
        bird1.fly();
    }
}
