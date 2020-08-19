import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] entrance = scanner.nextLine().split(" ");
        int shift = scanner.nextInt();

       /* for (int i = 0; i < entrance.length; i++) {
            System.out.print(entrance[i] + " ");
        }*/

        // Rotate the given array by n (shift) times towards right
        if (shift > entrance.length) {
            do {
                shift = shift - entrance.length;
            } while (shift > entrance.length);

        }
        for (int i = 0; i < shift; i++) {
            int j;
            String last;
            //Stores the last element of array
            last = entrance[entrance.length - 1];

            for (j = entrance.length - 1; j > 0; j--) {
                //Shift element of array by one
                entrance[j] = entrance[j - 1];
            }
            //Last element of array will be added to the start of array.
            entrance[0] = last;
        }

        for (String s : entrance) {
            System.out.print(s + " ");
        }
    }
}