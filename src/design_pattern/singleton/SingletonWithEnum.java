package design_pattern.singleton;

/*
* By Default, all constructors are private, and so enum by default only one it's object is created, and in the
* So as per JVM each JVM only one snapshot of the enum is present. So it's do one object per JVM.
*
* */

public enum SingletonWithEnum {

    INSTANCE;
}
