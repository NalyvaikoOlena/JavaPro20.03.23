package HomeWork4;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog("Шарік");
        Animal animal2 = new Cat("Мурзік");
        Animal animal3 = new Dog("Рекс");

        animal1.run(400);
        animal2.swim(5);
        animal3.swim(15);

        System.out.println("Кількість створених тварин: " + Animal.getCount());
        System.out.println("Кількість створених собак: " + Dog.getCount());
        System.out.println("Кількість створених кітів: " + Cat.getCount());
    }
}