import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String strAfter = str.replaceAll("a", "b");
        System.out.println(strAfter);
    }
}