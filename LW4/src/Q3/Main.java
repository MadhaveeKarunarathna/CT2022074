package Q3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter outer radius: ");
        double ro = input.nextDouble();

        System.out.print("Enter inner radius: ");
        double ri = input.nextDouble();

        Circle outer = new Circle(ro);
        Circle inner = new Circle(ri);

        double shadedArea = outer.computeArea() - inner.computeArea();

        System.out.println("Shaded Area: " + shadedArea);
    }
}
