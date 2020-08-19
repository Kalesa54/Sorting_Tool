import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        // write your code here
        boolean isComposite = false;

        if (number > 3) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isComposite = true;
                    break;
                } else {
                    isComposite = false;
                }
            }
        } else {
            isComposite = false;
        }
        return isComposite;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}