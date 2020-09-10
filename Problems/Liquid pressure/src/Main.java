import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double densityOfLiquid = scanner.nextDouble();
        double heightOfColumn = scanner.nextDouble();
        double gravity = 9.8;

        double liquidPressure = densityOfLiquid * heightOfColumn * gravity;

        System.out.println((float) liquidPressure);
    }
}