import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next().toUpperCase();

        if (str.charAt(0) == 'J') {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}