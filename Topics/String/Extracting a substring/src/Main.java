import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(text.substring(a, b+1));
    }
}