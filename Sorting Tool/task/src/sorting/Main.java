package sorting;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        long amountOfNumbers = 0;
        long firstNumber = 0;
        long maxNumber = 0;
        long maxNumberCounter = 0;

        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            // write your code here
            firstNumber = number;

            if (maxNumber < firstNumber) {
                maxNumber = firstNumber;
                maxNumberCounter = 0;
            }

            if (number == maxNumber) {
                maxNumberCounter++;
            }

            amountOfNumbers++;
        }

        System.out.println("Total numbers: " + amountOfNumbers + ".");
        System.out.println("The greatest number: " + maxNumber + " (" + maxNumberCounter + " time(s)).");
    }
}
