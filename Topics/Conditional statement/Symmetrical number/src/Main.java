import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n1 = n / 100;
        int n2 = n % 10 * 10 + n % 100 / 10;
        if (n1 == n2) {
            System.out.print(1);
        } else {
            System.out.print(37);
        }
    }
}
