import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        long fact = n;

        if (n != 0) {
            for (long i = n - 1; i >= 1; i--) {
                fact = fact * i;
            }
            return fact;

        } else {
            return 1;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}