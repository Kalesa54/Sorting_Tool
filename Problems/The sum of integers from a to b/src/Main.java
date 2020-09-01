import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int sum;
        int counter = start; // 3

        for (int i = start + 1; i <= end; i++) { // i = 5
            sum = counter + i; // sum = 7 + 5
            counter = sum; // counter = 12
        }

        System.out.println(counter);
    }
}