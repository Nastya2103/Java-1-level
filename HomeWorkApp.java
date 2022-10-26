package Lesson1.Homework;

public class HomeWorkApp {

    public static void main(String[] args) {
                printThreeWords();
                checkSumSign();
                printColor();
                compareNumbers();
    }
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    private static void checkSumSign() {
        int a = 3;
        int b = 6;
        int c = (a+b);
        System.out.println("" + c);

    if (c >= 0) {
        System.out.println("Сумма положительная");
    } else if (c < 0) {
        System.out.println("Сумма отрицательная");
    }
    }
    private static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    private static void compareNumbers() {
        int a = 7;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    }




