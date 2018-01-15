package getInstance;

public class Application {
    public static void main(String[] args) {
        SingletonObject singleton1 = SingletonObject.getInstance();
        SingletonObject singleton2 = SingletonObject.getInstance();
        SingletonObject singleton3 = SingletonObject.getInstance();

        System.out.println("String from singleton1 is " + singleton1.getMessage());
        System.out.println("String from singleton2 is " + singleton2.getMessage());
        System.out.println("String from singleton3 is " + singleton3.getMessage() + "\n");

        singleton1.setMessage(singleton1.getMessage().toUpperCase());
        System.out.println("String from singleton1 is " + singleton1.getMessage());
        System.out.println("String from singleton2 is " + singleton2.getMessage());
        System.out.println("String from singleton3 is " + singleton3.getMessage() + "\n");

        singleton1.setMessage(singleton1.getMessage().toLowerCase());
        System.out.println("String from singleton1 is " + singleton1.getMessage());
        System.out.println("String from singleton2 is " + singleton2.getMessage());
        System.out.println("String from singleton3 is " + singleton3.getMessage() + "\n");
    }
}
