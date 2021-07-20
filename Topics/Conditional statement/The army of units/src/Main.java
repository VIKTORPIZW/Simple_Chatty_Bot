import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        if (h < 1) {
            System.out.println("no army");
        } else if (h <=19) {
            System.out.println("pack");
        } else  if (h <= 249) {
            System.out.println("throng");
        } else if ( h <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}