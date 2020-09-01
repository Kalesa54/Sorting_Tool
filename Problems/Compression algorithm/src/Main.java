import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        char[] inpArray = input.toCharArray();
        int count = 1;
        char letter = 0;

        for (int i = 0; i < input.length() - 1; i++) {
            letter = inpArray[i];
            if (letter == inpArray[i + 1]) {
                count++;
            }
            if (letter != inpArray[i + 1]) {
                System.out.print(letter + "" + count);
                count = 1;
            }

        }
        System.out.print(letter + "" + count);
    }
}

