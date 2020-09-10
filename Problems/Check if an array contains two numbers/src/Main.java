import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        boolean value = false;


        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        for (int i = 0; i < arraySize - 1; i++) {
            if (numberOne == array[i] && numberTwo == array[i + 1]
                    || numberTwo == array[i] && numberOne == array[i + 1]) {
                value = true;
                break;
            } else {
                value = false;
            }
        }
        System.out.println(value);
    }
}