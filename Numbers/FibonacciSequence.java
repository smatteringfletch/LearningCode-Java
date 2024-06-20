import java.util.Scanner;
public class FibonacciSequence {
    public static void main(String[] args) {
        // Goal: Create code to run a Fibonacci Sequence. Run up to the users discretion
        // Initial variables
        long n1 = 0, n2 = 1, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want in this fibonacci sequence?: ");
        int n = sc.nextInt();
        // Cycle through the sequence for the number entered by the user.
        for (int i = 0; i < n; i++) {
            System.out.print(n1 + " ");
            temp = n1 + n2;
            n2 = n1;
            n1 = temp;
        }
    }
}
