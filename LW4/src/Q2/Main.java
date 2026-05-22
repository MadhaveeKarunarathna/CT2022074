package Q2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        Temperature temp = new Temperature();

        temp.setFahrenheit(fahrenheit);

        System.out.println("Temperature in Celsius: " + temp.toCelsius());
    }
}
