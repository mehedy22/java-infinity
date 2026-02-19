package reflection.constructors;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Class reflectionConstructors = ReflectionConstructors.class;

        // get private constructor
        Constructor[] constructors = reflectionConstructors.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Modifier: " + Modifier.toString(constructor.getModifiers()) );
            System.out.println("Constructor name: " + constructor.getName());


            /*
            * Here one of the major concern is Reflection break the concept of Singleton here
            * IN this example we have seen that even the Constructor is Private with Reflection
            * we still can create an object of that class.
            *
            * */
            constructor.setAccessible(true);
            ReflectionConstructors object=(ReflectionConstructors) constructor.newInstance();
            object.eat();
            object.fly();
        }

    }
}
