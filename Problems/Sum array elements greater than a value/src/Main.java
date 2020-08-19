import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt(); // size of the array
        int[] array = new int[arraySize]; // elements of the array
        int n = 0; // number n
        int sum = 0;

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        n = scanner.nextInt();

        for (int i = 0; i < arraySize; i++) {
            for (int in : array) {

                in = array[i];
                if (in > n) {
                    sum = sum + in;

                    break;
                } else {
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
