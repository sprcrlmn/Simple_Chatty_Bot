import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(1 + ((h-d) / (d-n)) + ((h-d) % (d-n) + (d-n) - 1) / (d-n));
    }
}