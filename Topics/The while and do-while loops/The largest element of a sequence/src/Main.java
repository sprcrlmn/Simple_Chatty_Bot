import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = -1;
        int i = 0;
        while(x != 0) {
            x = scanner.nextInt();
            if (x > i) {
                i = x;
            }
        }
        System.out.println(i);
    }
}