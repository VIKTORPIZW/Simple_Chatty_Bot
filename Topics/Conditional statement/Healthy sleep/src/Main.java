import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourMin = scanner.nextInt();
        int hourMax = scanner.nextInt();
        int hourAnn = scanner.nextInt();
        if (hourAnn < hourMin) {
            System.out.println("Deficiency");
        } else  if (hourAnn > hourMax) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}