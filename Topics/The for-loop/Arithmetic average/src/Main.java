import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        double count = 0;
        double result = 0;
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0) {
                count++;
                result += i;
            }
        }
        System.out.println(result / count);
    }
}