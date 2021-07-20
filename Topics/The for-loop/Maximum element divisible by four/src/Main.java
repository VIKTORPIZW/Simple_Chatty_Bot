import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int result = 0;
        int x = 0;
        for (int i = 1; i <= count; i++) {
            x = scanner.nextInt();
            if (x % 4 == 0 && x > result) {
                result = x;
            }
        }
        System.out.println(result);
    }
}