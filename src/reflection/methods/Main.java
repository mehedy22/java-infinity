package reflection.methods;

import reflection.classes.ReflectionClasses;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) {
        Class reflectionMethods = ReflectionMethods.class;
        Method[] methods = reflectionMethods.getMethods(); // returns only the public methods
        Method[] methodsPrivates = reflectionMethods.getDeclaredMethods(); // returns all the public and private methods


        for (Method method : methods) {
            System.out.println("Method name: " + method.getName() + "`");
            System.out.println("Method return type: " + method.getReturnType() + "`");
            System.out.println("Class Name: " + method.getDeclaringClass() + "`");
            System.out.println(Modifier.toString(method.getModifiers()));
        }
    }
}
