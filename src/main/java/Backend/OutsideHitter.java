package Backend;

public class OutsideHitter extends Position {
    private static final OutsideHitter INSTANCE = new OutsideHitter();

    private OutsideHitter() {
        super("Outside Hitter");
    }

    public static OutsideHitter getInstance() {
        return INSTANCE;
    }
}
