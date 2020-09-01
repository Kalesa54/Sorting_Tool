import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boundary = scanner.nextInt();
        int number = 1;
        int square = 0;

        while (square <= boundary - 1) {
            square = number * number;
            if (square <= boundary) {
                System.out.println(square);
            }
            number++;
        }
    }
}
