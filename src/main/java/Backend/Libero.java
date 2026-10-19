package Backend;

public class Libero extends Position {
    private static final Libero INSTANCE = new Libero();

    private Libero() {
        super("Libero");
    }

    public static Libero getInstance() {
        return INSTANCE;
    }
}
