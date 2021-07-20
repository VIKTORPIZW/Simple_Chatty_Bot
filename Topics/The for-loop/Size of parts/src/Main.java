import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 0;
        int good = 0;
        int big = 0;
        int lol = 0;
        for (int i = 1; i <= n; i++) {
            x = scanner.nextInt();
            if (x == 0) {
                good++;
            } else if (x == -1) {
                lol++;
            } else {
                big++;
            }
        }
        System.out.println(good + " " + big + " " + lol);
    }
}