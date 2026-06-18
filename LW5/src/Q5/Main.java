package Q5;

import java.util.ArrayList;
import java.util.Scanner;

class Pet {
    private String name;

    public String getName() { return name; }
    public void setName(String petName) { name = petName; }

    public String speak() { return "I'm your cuddly little pet."; }
}

class Dog extends Pet {
    private double weight;

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    @Override
    public String speak() { return "Woof!"; }
}

class Cat extends Pet {
    private String coatColor;

    public String getCoatColor() { return coatColor; }
    public void setCoatColor(String coatColor) { this.coatColor = coatColor; }

    @Override
    public String speak() { return "Meow!"; }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        System.out.println("Enter pet name and type (c = cat, d = dog). Type STOP to finish.");

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine().trim();

            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Type (c/d): ");
            String type = scanner.nextLine().trim().toLowerCase();

            if (type.equals("d")) {
                System.out.print("Weight (kg): ");
                double weight = Double.parseDouble(scanner.nextLine().trim());

                Dog dog = new Dog();
                dog.setName(name);
                dog.setWeight(weight);
                pets.add(dog);

            } else if (type.equals("c")) {
                System.out.print("Coat color: ");
                String color = scanner.nextLine().trim();

                Cat cat = new Cat();
                cat.setName(name);
                cat.setCoatColor(color);
                pets.add(cat);

            } else {
                System.out.println("Invalid type. Enter c or d.");
            }
        }

        // Build a separate dog array
        ArrayList<Dog> dogs = new ArrayList<>();
        for (Pet pet : pets) {
            if (pet instanceof Dog) {
                dogs.add((Dog) pet);
            }
        }

        if (dogs.isEmpty()) {
            System.out.println("\nNo dogs entered. Cannot compute stats.");
        } else {
            double total = 0;
            double min = dogs.get(0).getWeight();
            double max = dogs.get(0).getWeight();

            for (Dog dog : dogs) {
                double w = dog.getWeight();
                total += w;
                if (w < min) min = w;
                if (w > max) max = w;
            }

            double average = total / dogs.size();

            System.out.println("\n--- Dog Weight Stats ---");
            System.out.printf("Average: %.2f kg%n", average);
            System.out.printf("Minimum: %.2f kg%n", min);
            System.out.printf("Maximum: %.2f kg%n", max);
        }

        scanner.close();
    }
}
