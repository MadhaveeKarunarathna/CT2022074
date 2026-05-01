import java.util.Scanner;

class Q2Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter centimeters: ");
        double centimeters = scanner.nextDouble();

        double totalInches = centimeters / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println(centimeters + " cm = " + feet + " feet and " + inches + " inches");
    }
}