package LazyInitialization;

public class LazyInitializedSingletone {

    private static LazyInitializedSingletone instance = null;

    private LazyInitializedSingletone() {
    }

    public static LazyInitializedSingletone getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingletone();
        }
        return instance;
    }

    public String showText(String text) {
        System.out.println(text);
        return text;
    }
}
