import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int food = scanner.nextInt();
        int ticket = scanner.nextInt() * 2;
        int hotel = scanner.nextInt() * (days - 1);
        int cash = ( days * food) + ticket + hotel;
        System.out.println(cash);
    }
}
