import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        int length = 1;
        int longestSequence = 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] < array[i + 1]) {
                length++;
            } else {
                length = 1;
            }
            if (longestSequence < length) {
                longestSequence = length;
            }

        }
        System.out.println(longestSequence);
    }
}