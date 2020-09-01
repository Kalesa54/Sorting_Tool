import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int minimumOfArray;

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        minimumOfArray = array[0];

        for (int i = 0; i < arraySize - 1; i++) {

            if (minimumOfArray > array[i + 1]) {
                minimumOfArray = array[i + 1];
            }
        }

        System.out.println(minimumOfArray);
    }
}