import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long hour = scanner.nextLong();  // 1 hour = 60 Minutes = 60 * 60
        long minute = scanner.nextLong(); // 1 minute = 60 seconds
        long second = scanner.nextLong();
        long secondHours = scanner.nextLong();
        long secondMinutes = scanner.nextLong();
        long secondSeconds = scanner.nextLong();

        long calculatedSeconds = hour * 3_600 + minute * 60 + second;
        long caluclatedSeconds2 = secondHours * 3_600 + secondMinutes * 60 + secondSeconds;

        long difference = caluclatedSeconds2 - calculatedSeconds;

        System.out.println(difference);
    }
}