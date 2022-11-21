import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 2;
        int summ = 0;
        while(x != 0) {
            x = scanner.nextInt();
            summ += x;
        }
        System.out.println(summ);


    }
}