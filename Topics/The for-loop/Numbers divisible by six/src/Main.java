import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countAll = scanner.nextInt();
        int result = 0;
        int x = 0;
        for (int i = 1; i <= countAll; i++) {
            x = scanner.nextInt();
            if (x % 6 == 0) {
                result += x;
            }
        }
        System.out.println(result);
    }
}