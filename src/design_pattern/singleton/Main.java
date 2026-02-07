package design_pattern.singleton;

public class Main {
    public static void main(String[] args) {

        Singleton fromEmployee = Singleton.getInstance();
        System.out.println(fromEmployee);

        Singleton fromStudent = Singleton.getInstance();
        System.out.println(fromStudent);
    }
}
