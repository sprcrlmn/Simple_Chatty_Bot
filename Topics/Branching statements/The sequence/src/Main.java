import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = 0;
        int m = 0;
        for (int i = 1; i <= n; ++i) {
            h += i;
            if (h <= n) {
                System.out.println((i + " ").repeat(i));
            } else {
                System.out.println((i + " ").repeat(n - m));
                break;
            }
            m = h;

        }
    }
}
