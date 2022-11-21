import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxt = 0;
        while (scanner.hasNextInt()) {
            int elem = scanner.nextInt();
            if (elem % 4 == 0 && elem > maxt) {
                maxt=elem;
            }
            if (maxt==8){
                maxt = 4;
            }
        }
        System.out.println(maxt);
    }
}