/*
  Find PI to the Nth Digit -
  Enter a number and have the program generate PI up to that many decimal places.
  Keep a limit to how far the program will go.
 */
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.math.BigDecimal;


public class PiDigit {
    public static void main(String[] args) throws InputMismatchException {
        // Create variables needed
        int digits;
        int limit = 15;
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("How many digits of Pi would you like to return? ");
        digits = sc.nextInt();
        sc.close();

            if (digits > limit){
                System.out.println("You've attempted to pull more digits of PI than you are limited to, please try again");
            }
            else {
                BigDecimal pie = new BigDecimal(Math.PI).setScale(digits, RoundingMode.HALF_UP);
                System.out.println(pie.toPlainString());
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid variable type passed");
            System.out.println(e);
        }


    }
}
