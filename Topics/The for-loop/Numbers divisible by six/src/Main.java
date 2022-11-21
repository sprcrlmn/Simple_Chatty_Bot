import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            int x = scanner.nextInt();
            int b = x % 6 == 0 ? x : 0;
            sum += b;

        }
        System.out.println(sum);
    }
}