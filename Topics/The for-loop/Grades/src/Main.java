import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int countX;
        for (int i = 1; i <= n; i++) {
            countX = scanner.nextInt();
            if (countX == 5) {
                a++;
            } else if (countX == 4) {
                b++;
            } else if (countX == 3) {
                c++;
            } else if (countX == 2) {
                d++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}