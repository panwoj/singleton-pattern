package staticBlockInitialization;

public class StaticBlockInitalization {
    private static StaticBlockInitalization staticBlockInitalizationInstance;

    public StaticBlockInitalization() {}

    static {
        try {
            staticBlockInitalizationInstance = new StaticBlockInitalization();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static  StaticBlockInitalization getInstance() {
        return staticBlockInitalizationInstance;
    }

    public boolean searchForWord(String word) {
        System.out.println("Searching for word \"" + word + "\"... ");
        return true;
    }
}
