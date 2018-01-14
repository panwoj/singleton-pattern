package eagerInitialization;

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton eagerInitializedSingletonInstance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {}

    public static EagerInitializedSingleton getInstance() {
        return eagerInitializedSingletonInstance;
    }

    public String showLog(String log) {
        System.out.println("[" + log + "]");
        return log;
    }
}
