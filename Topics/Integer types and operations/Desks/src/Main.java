import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        System.out.println(x1/2 + x1%2 +x2/2 + x2%2 + x3/2 + x3%2);
    }
}