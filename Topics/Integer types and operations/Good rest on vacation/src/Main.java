import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int nightInHotel = scanner.nextInt();
        System.out.println(foodCost*duration + flightCost*2 + (duration-1)*nightInHotel);
    }
}