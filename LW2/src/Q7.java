import java.util.Scanner;

class Q7Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        int weight = scanner.nextInt();

        System.out.print("Enter height in cm: ");
        int height = scanner.nextInt();

        double bmi = weight / Math.pow(height / 100.0, 2);

        System.out.println("Your BMI is: " + bmi);
    }
}
