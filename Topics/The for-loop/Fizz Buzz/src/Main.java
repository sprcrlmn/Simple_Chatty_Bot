import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        final int fizzNumber = 3;
        final int buzzNumber = 5;
        while (a <= b) {
            if (a % fizzNumber == 0) {
                if (a % buzzNumber == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (a % buzzNumber == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(a);
            }
            ++a;
        }
    }
}
