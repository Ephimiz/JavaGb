import java.util.*;

public class lesson2 {

  public static void main(String[] args) {

        boolean result = checkSumSign(10, 30);
        System.out.println(result? "true" : "false");

        checkValue(-5);

        boolean check = LessThanZeroCheck(-1);
        System.out.println(check? "true" : "false");


        MultiplePrint("hi", 6);
  }

      static boolean checkSumSign(int a, int b) {
          return a + b >= 10 && a + b <= 20;
      }

      static void checkValue(int c) {
         if (c < 0) {
           System.out.println("value is negative");
         } else {
           System.out.println("value is positive");
         }
      }

      static boolean LessThanZeroCheck(int a) {
        int b = 0;
        return a < b;
      }

      static void MultiplePrint(String a, int b) {
          int c ;
          for (c = 0; c < b; c++) {
            System.out.print(a + " ");
          }
      }
}
