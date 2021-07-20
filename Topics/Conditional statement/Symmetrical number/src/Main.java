import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char a = str.charAt(0);
        char b = str.charAt(1);
        char c = str.charAt(2);
        char d = str.charAt(3);
        String a1 = String.valueOf(a);
        String b1 = String.valueOf(b);
        String c1 = String.valueOf(c);
        String d1 = String.valueOf(d);
        if (a1.equalsIgnoreCase(d1) && b1.equalsIgnoreCase(c1)) {
            System.out.println(1);
        } else {
            System.out.println(22);
        }

    }
}