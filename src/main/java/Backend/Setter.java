package Backend;

public class Setter extends Position {
    private static final Setter INSTANCE = new Setter();

    private Setter() {
        super("Setter");
    }

    public static Setter getInstance() {
        return INSTANCE;
    }
}
