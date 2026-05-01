import java.util.Scanner;

class Q4Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double bodyWeight = scanner.nextDouble();

        double calories = bodyWeight * 19;

        System.out.println("Calories needed per day: " + calories);
    }
}