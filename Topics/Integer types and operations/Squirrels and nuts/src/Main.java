import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextShort();
        int k = scanner.nextShort();
        int res = k % n;
        System.out.println(res);
    }
}