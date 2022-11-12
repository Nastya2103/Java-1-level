package Practic3;

public class LessonThird {
    public static void main(String args[]) {
        massive1();
        massive2();
        massive3();
        massive4();
        System.out.println(massive5(4, 6));
        massive6();
    }

    public static void massive1() {
        int[] mass = {0, 1, 0, 1, 1, 0, 0, 1, 1};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 1 && i++ == 1) {
                System.out.print("0" + " | ");
            } else {
                System.out.print("1" + " | ");
            }
        }
        System.out.println();
    }


    public static void massive2() {
        int[] sive = new int[100];
        for (int d = 1; d < sive.length; d++) {
            System.out.print(" | " + d);
        }
        System.out.println();
    }

    public static void massive3() {
        int[] numb = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int k = 0; k < numb.length; k++)
            if (numb[k] < 6) {
                System.out.print(numb[k] *= 2);
            }
        System.out.println();
    }

    public static void massive4() {
        int[][] diag = new int[4][4];
        for (int r = 0; r < 4; r++) {
            for (int q = 0; q < 4; q++) {
                if (r == 0 && q == 0 || r == 1 && q == 1 || r == 2 && q == 2 || r == 3 && q == 3 || r == 3 && q == 0 || r == 2 && q == 1 || r == 1 && q == 2 || r == 0 && q == 3) {
                    System.out.print("1" + " | ");
                } else {
                    System.out.print("3" + " | ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[] massive5(int len, int initialValue) {
        int[] five = new int[len];
        for (int i = 0; i < five.length; i++) {
            five[i] = initialValue;
        }
        return five;
    }
    public static void printFive(int[] meaning) {
        for (int i = 0; i < meaning.length; i++) {
            System.out.print(meaning[i] + " ");
        }
    }

    public static void massive6() {
        int[] six = {6, 9, 10, 25, 98, 3, 15, 13, 7};
        int min = six[0];
        for (int i = 0; i < six.length; i++) {
            if (six[i] < min)
                min = six[i];
        }
        System.out.println("Min is " + min);
    }
}
















