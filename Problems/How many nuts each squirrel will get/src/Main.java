import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //Amount of squirrels
        int k = scanner.nextInt(); // amount of nuts

        int nutPerSquirrel = k / n;

        System.out.println(nutPerSquirrel);


    }
}