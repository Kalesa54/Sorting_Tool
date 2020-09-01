import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String inputLowerCase = input.toLowerCase();

        if (inputLowerCase.contains("the")) {
            System.out.println(inputLowerCase.indexOf("the"));
        } else {
            System.out.println("-1");
        }
    }
}