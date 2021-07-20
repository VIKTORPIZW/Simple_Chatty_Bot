import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long start = scanner.nextInt();
        long end = scanner.nextInt();
        long result = 1;
        for (long i = start; i < end; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}