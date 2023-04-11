package HomeWork4;

public class Dog extends Animal {

        private static int count = 0;
        private static final int MAX_RUN_DISTANCE = 500;
        private static final int MAX_SWIM_DISTANCE = 10;

        public Dog(String name) {
            super(name, MAX_RUN_DISTANCE, MAX_SWIM_DISTANCE);
            count++;
        }

        public static int getCount() {
            return count;
        }
}
