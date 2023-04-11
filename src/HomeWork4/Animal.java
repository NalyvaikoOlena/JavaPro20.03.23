package HomeWork4;

public class Animal {

        private static int count = 0;
        private String name;
        private int maxRunDistance;
        private int maxSwimDistance;

        public Animal(String name, int maxRunDistance, int maxSwimDistance) {
            this.name = name;
            this.maxRunDistance = maxRunDistance;
            this.maxSwimDistance = maxSwimDistance;
            count++;
        }

        public static int getCount() {
            return count;
        }

        public void run(int distance) {
            if (distance > maxRunDistance) {
                System.out.printf("%s не зміг пробігти %d метрів%n", name, distance);
            } else {
                System.out.printf("%s пробіг %d метрів%n", name, distance);
            }
        }

        public void swim(int distance) {
            if (maxSwimDistance == 0) {
                System.out.printf("%s не вміє плавати%n", name);
            } else if (distance > maxSwimDistance) {
                System.out.printf("%s не зміг проплисти %d метрів%n", name, distance);
            } else {
                System.out.printf("%s проплив %d метрів%n", name, distance);
            }
        }

}
