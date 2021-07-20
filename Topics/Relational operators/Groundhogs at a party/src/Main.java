import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean day = scanner.nextBoolean();
        if (cups >= 10 && cups <= 20 && !day) {
            System.out.println(true);
        } else if (cups >= 15 && cups <= 25 && day) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}