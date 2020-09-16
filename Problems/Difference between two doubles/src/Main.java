import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float firstNumber = scanner.nextFloat();
        float secondNumber = scanner.nextFloat();

        System.out.println(secondNumber - firstNumber);
    }
}