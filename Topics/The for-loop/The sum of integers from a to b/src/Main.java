import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sumAb;
        for (sumAb = 0; a <= b; ++a) {
            sumAb += a;
        }
        System.out.println(sumAb);
    }
}