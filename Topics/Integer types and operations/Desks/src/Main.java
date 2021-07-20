import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();
        int result = group / 2 + group % 2 + group2 / 2 + group2 % 2 + group3 / 2 + group3 % 2;
        System.out.println(result);


    }
}