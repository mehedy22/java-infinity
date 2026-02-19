package reflection;


/*
* This is used to examine the Classes, Methods, Fields, Interfaces at runtime and also possible
  to change the behavior of classes too.
* Reflection is a feature in Java that allows a program to inspect and manipulate classes, methods,
  fields, and constructors at runtime — even if they are private.
*
* It is mainly used in frameworks like Spring and Hibernate for dependency injection,
  dynamic object creation, and annotation processing.
*/

/*
 * To reflect the class, we first need to get an Object of Class.
 * What is this class Class?
 * Instance of the class Class represents classes during runtime.
 * JVM creates one Class object for each and every class which is loaded during runtime.
 * This Class object, has meta data information about the particular class like it's method, fields and constructors etc.
 *
 * */

// How to get the particular class Class object?
// There are three ways.
// 1. Using forName() method
// 2. Using .class
// 3. Using getClass() method


/*

// 1. Using forName() method
// assume we have one class called Reflection
public class Reflection {
}
// get the object of Class for getting the metadata information of Reflection class.
Class reflectionClass = Class.forName("Reflection")

*/


/*

// 2. Using.class method
// assume we have one class called Reflection
public class Reflection {
}
// get the object of Class for getting the metadata information of Reflection class.
Class reflectionClass = Reflection.class

*/

/*

// 3. Using getClass() method
// assume we have one class called Reflection
public class Reflection {
}

Reflection reflection=new Reflection();

// get the object of Class for getting the metadata information of Reflection class.
Class reflectionClass = reflection.getClass();

*/