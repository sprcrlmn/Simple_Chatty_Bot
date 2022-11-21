import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = -1;
        while (x != 0) {
            x = scanner.nextInt();
            if (x == 0) {
                break;
            }
            System.out.println(x % 2 == 0 ? "even" : "odd");
        }
    }
}
