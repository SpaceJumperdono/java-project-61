package hexlet.code;

public class Utils {
    public static final int INITIAL_RANGE = 1;
    public static final int END_RANGE = 100;


    public static int generateValueWithRange() {
        return INITIAL_RANGE + (int) (Math.random() * END_RANGE + 1);
    }

    public static int generateSpecialValue(int value) {
        return (int) (Math.random() * value + 1);
    }
    public static int generateArrayIndex(int arrayLength) {
        return (int) (Math.random() * arrayLength);
    }

}
