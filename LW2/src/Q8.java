import java.util.Scanner;

class Q8Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double PI = 3.14;

        System.out.print("Enter radius of the sphere: ");
        double radius = scanner.nextDouble();

        double volume = (4.0 / 3.0) * (PI * Math.pow(radius, 3));

        System.out.println("Volume of sphere: " + volume);
    }
}
