import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distanceBetweenTwoCities = scanner.nextDouble();
        double travelTimeByBus = scanner.nextDouble();
        double averageSpeedOfBus;

        averageSpeedOfBus = distanceBetweenTwoCities / travelTimeByBus;

        System.out.println(averageSpeedOfBus);
    }
}