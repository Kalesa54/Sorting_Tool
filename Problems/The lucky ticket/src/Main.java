import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String characterString = scanner.nextLine();
        int sum;
        int sum2;

        char[] splitted = characterString.toCharArray();

        int valueOne = Character.getNumericValue(splitted[0]);
        int valueTwo = Character.getNumericValue(splitted[1]);
        int valueThree = Character.getNumericValue(splitted[2]);

        sum = valueOne + valueTwo + valueThree;

        int valueFour = Character.getNumericValue(splitted[3]);
        int valueFive = Character.getNumericValue(splitted[4]);
        int valueSix = Character.getNumericValue(splitted[5]);

        sum2 = valueFour + valueFive + valueSix;

        if (sum == sum2) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}
