package reflection.constructors;

import reflection.classes.ReflectionClasses;

import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) {
        Class reflectionClass = ReflectionClasses.class;
        System.out.println(reflectionClass.getName());
        System.out.println(Modifier.toString(reflectionClass.getModifiers()));
    }
}
