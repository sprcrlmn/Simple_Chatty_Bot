import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxX = 0;
        for (int i = 0; i < n; ++i) {
            int x = scanner.nextInt();
            if (x % 4 == 0 && x > maxX) {
                maxX = x;
            }
        }
        System.out.println(maxX);
    }
}