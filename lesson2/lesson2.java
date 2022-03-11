import java.util.*;
/**
* Java 1. Homework #2
*
* @author Ephim
* @version 09.03.2022
*
*
*
*/
public class lesson2 {

  public static void main(String[] args) {


        System.out.println(checkSumSign(10, -5));
        System.out.println(checkSumSign(20, 0));
        System.out.println(checkSumSign(1, -5));
        System.out.println(checkSumSign(1, 10));
        System.out.println(" ");

        checkValue(-5);
        System.out.println(" ");

        System.out.println(lessThanZeroCheck(1));
        System.out.println(lessThanZeroCheck(-1));
        System.out.println(lessThanZeroCheck(12));
        System.out.println(" ");

        repeatPrint("hi", 6);


  }


  static boolean checkSumSign(int a, int b) {
        return a + b >= 10 && a + b <= 20;
  }

  static void checkValue(int c) {
        System.out.println(c >= 0? "Positive" : "Negative");
  }

  static boolean lessThanZeroCheck(int a) {
        return a < 0;
  }

  static void repeatPrint(String a, int count) {
        for (int c = 0; c < count; c++) {
        System.out.print(a + " ");
  }
  }
}
