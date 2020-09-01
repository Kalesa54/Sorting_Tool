import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] numbers = new int[arraySize];
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int number = scanner.nextInt();

        for (int j : numbers) {

            if (j == number) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}