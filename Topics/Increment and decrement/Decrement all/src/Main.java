import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count1 = scanner.nextInt();
        int count2 = scanner.nextInt();
        int count3 = scanner.nextInt();
        int count4 = scanner.nextInt();
        System.out.println(--count1 + " " + --count2 + " " + --count3 + " " + --count4);
    }
}