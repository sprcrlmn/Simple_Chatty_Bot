import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < n; ++i) {
            String grade = scanner.next();
            if (grade.contains("A")) {
                ++a;
            } else if (grade.contains("B")) {
                ++b;
            } else if (grade.contains("C")) {
                ++c;
            } else {
                ++d;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);

    }
}
