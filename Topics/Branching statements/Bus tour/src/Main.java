import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int n = scanner.nextInt();


        for (int i = 0; i < n; ++i) {
            int bridg = scanner.nextInt();

            if (bridg <= h) {
                System.out.println("Will crash on bridge " + (i + 1));

                break;
            }
            if (i + 1 == n) {
                System.out.println("Will not crash");
            }

        }

    }
}