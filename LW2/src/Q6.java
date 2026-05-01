import java.util.Scanner;

class Q6Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        int age = 2025 - birthYear;

        System.out.println("You were born in " + birthYear + " and will be (are) " + age + " this year.");
    }
}
