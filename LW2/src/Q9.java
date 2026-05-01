import java.util.Scanner;

class Q9Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (R): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter number of years (N): ");
        int years = scanner.nextInt();

        double amount = principal * Math.pow(1 + (rate / 100), years);

        System.out.println("Amount after " + years + " years: $" + amount);
    }
}
