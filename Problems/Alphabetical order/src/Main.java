import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] string = scanner.nextLine().split(" ");
        boolean order = false;

        for (int i = 0; i < string.length - 1; i++) {

            if (string[i].compareTo(string[i + 1]) < 0 || string[i].compareTo(string[i + 1]) == 0) {
                order = true;
            } else {
                order = false;
            }
        }
        System.out.println(order);
    }
}
