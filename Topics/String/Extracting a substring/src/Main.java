import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = scanner.nextInt();
        int count2 = scanner.nextInt() + 1;
        String result = str.substring(count, count2);
        System.out.println(result);
    }
}