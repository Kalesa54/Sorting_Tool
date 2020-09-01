import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int product;
        int maxproduct = 0;

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < arraySize - 1; i++) {

            product = array[i] * array[i + 1];

            if (product > maxproduct) {
                maxproduct = product;
            }
        }
        System.out.println(maxproduct);
    }
}