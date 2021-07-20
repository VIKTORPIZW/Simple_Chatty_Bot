import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        if (h <= 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}