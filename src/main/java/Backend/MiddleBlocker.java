package Backend;

public class MiddleBlocker extends Position {
    private static final MiddleBlocker INSTANCE = new MiddleBlocker();

    private MiddleBlocker() {
        super("Middle Blocker");
    }

    public static MiddleBlocker getInstance() {
        return INSTANCE;
    }
}
