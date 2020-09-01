import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int sumOfArray = 0;

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
            sumOfArray = sumOfArray + array[i];
        }
        System.out.println(sumOfArray);
    }
}