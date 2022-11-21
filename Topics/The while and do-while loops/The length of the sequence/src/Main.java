import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int x;
        do {
            x = scanner.nextInt();
            ++i;
        } while (x != 0);
        System.out.print(i - 1);
    }
}
