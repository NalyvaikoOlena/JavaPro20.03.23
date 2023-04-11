package HomeWork5;

public class Main {
    public static void main(String[] args) {
        String text = "Hello, World!";
        int count = 5;
        printTextMultipleTimes(text, count);
    }

    public static void printTextMultipleTimes(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

}