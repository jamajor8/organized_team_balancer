package Backend;

public class OppositeHitter extends Position {
    private static final OppositeHitter INSTANCE = new OppositeHitter();

    private OppositeHitter() {
        super("Opposite Hitter");
    }

    public static OppositeHitter getInstance() {
        return INSTANCE;
    }
}
