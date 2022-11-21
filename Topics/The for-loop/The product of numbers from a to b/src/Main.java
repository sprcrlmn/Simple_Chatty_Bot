import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long prod = 1;
        while (a < b) {
            prod *= a;
            ++a;
        }
        System.out.print(prod);
    }
}
