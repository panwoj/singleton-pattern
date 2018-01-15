package getInstance;

public class SingletonObject {
    private static SingletonObject singletonInstance = null;
    private String message = "Secret message";

    private SingletonObject() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static SingletonObject getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new SingletonObject();
        }
        return singletonInstance;
    }
}
