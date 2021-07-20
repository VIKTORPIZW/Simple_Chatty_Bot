import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        boolean result1 = one > 0 && two <= 0 && three <= 0;
        boolean result2 = two > 0 && one <= 0 && three <= 0;
        boolean result3 = three > 0 && one <= 0 && two <= 0;
        boolean resultFinal = result1 || result2 || result3;
        System.out.println(resultFinal);
    }
}