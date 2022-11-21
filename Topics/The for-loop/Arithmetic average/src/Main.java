import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sumAb = 0;
        int i = 0;
        while (a <= b) {
            if (a % 3) {
                sumAb += a;
                ++i;
            }
            ++a;
        }
        System.out.println(((double)sumAb)/i);

    }
}
