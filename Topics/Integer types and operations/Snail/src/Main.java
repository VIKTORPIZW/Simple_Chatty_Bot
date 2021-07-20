import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextShort();
        int a = scanner.nextShort();
        int b = scanner.nextShort();
        int res = (h - b - 1) / (a - b) + 1;
        System.out.println(res);
    }
}