import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = input;

        while (input != 0 && sum < 1000) {
            input = scanner.nextInt();
            sum = sum + input;
        }

        if (sum >= 1000) {
            sum = sum - 1000;
        }
        System.out.println(sum);
    }
}