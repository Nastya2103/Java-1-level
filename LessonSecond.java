package Homework2;

public class LessonSecond {

    public static void main(String[] args) {
        System.out.println(method1(10, 8));
        method2();
        System.out.println(method3(5));
        System.out.println(method4("", 5));
    }

    static boolean method1(int a, int b) {
        int c = (a + b);
        return c >= 10 && c <= 20;
    }

    public static void method2() {
        int p = -7;
        if (p >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean method3(int d) {
        if (d < 0) {
            return true;
        } else if (d >= 0) {
            return false;
        }
        return true;
    }

    public static String method4(String txtTo, int s) {
        for (int g = 0; g < s; g++) {
            System.out.println("Hello, friends!");
        }
        return txtTo;
    }
    }