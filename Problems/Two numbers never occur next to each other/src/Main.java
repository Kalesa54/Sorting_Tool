import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] numbers = new int[arraySize];
        boolean check = true;

        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < arraySize - 1; i++) {

            if (n == numbers[i] && m == numbers[i + 1]) {
                check = false;
                break;
            } else if (m == numbers[i] && n == numbers[i + 1]) {
                check = false;
                break;
            } else {
                check = true;
            }
        }
        System.out.println(check);
    }
}