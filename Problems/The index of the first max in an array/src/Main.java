import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        int maxValue = array[0];
        for (int j = 0; j <= arraySize - 1; j++) {
            if (array[j] > maxValue) {
                maxValue = array[j];
            }
        }
        for (int i = 0; i <= arraySize - 1; i++) {
            if (array[i] == maxValue) {
                System.out.println(i);
                break;
            }
        }
    }
}