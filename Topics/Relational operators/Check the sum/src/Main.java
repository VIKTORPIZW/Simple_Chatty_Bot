import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count1 = scanner.nextInt();
        int count2 = scanner.nextInt();
        int count3 = scanner.nextInt();
        int count = 20;
        boolean result = count1 + count2 == count ||
                count2 + count3 == count ||
                count3 + count1 == count;
        System.out.println(result);
    }
}