import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int perfect = 0;
        int larger = 0;
        int smaller = 0;
        for (int i = 0; i < n; ++i) {
            int part = scanner.nextInt();
            if (part == 0) {
                perfect += 1;
            } else if (part == 1) {
                larger += 1;
            } else {
                smaller += 1;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}
