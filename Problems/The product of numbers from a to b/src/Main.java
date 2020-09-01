import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        long productOfNumbers = start;

        for (int i = start + 1; i < end; i++) {
            productOfNumbers = productOfNumbers * i;
        }
        System.out.println(productOfNumbers);
    }
}