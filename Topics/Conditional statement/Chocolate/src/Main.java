import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int all = n * m;
        if (k > all) {
            System.out.println("NO");
        } else if (k % m == 0 || k % n == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}