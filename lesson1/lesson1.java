import java.util.*;

public class lesson1 {
    public static void main (String[] args) {

        printThreeWords();

        boolean result = checkSumSign(-45, 10);
        System.out.println(result? "Sum positive" : "Sum negative");

        printColor();
        compareNumbers();
    }
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static boolean checkSumSign(int a, int b) {
        return a + b >= 0;
    }
    static void printColor() {
        int value = 0;

        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 1) {
            System.out.println("Желтый");
        }
        else if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    static void compareNumbers() {
        int a, b;
        a = 2;
        b = 10;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}
