package HomeWork4;

public class Cat extends Animal {
    private static int count = 0;
    private static final int MAX_RUN_DISTANCE = 200;
    private static final int MAX_SWIM_DISTANCE = 0;

    public Cat(String name) {
        super(name, MAX_RUN_DISTANCE, MAX_SWIM_DISTANCE);
        count++;
    }

    public static int getCount() {
        return count;
    }
}
