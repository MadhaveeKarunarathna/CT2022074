package Q3;

import java.util.ArrayList;
import java.util.Scanner;

class Pet {
    private String name;

    public String getName() { return name; }
    public void setName(String petName) { name = petName; }

    public String speak() { return "I'm your cuddly little pet."; }
}

class Dog extends Pet {
    @Override
    public String speak() { return "Woof!"; }
}

class Cat extends Pet {
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
                Dog dog = new Dog();
                dog.setName(name);
                pets.add(dog);
            } else if (type.equals("c")) {
                Cat cat = new Cat();
                cat.setName(name);
                pets.add(cat);
            } else {
                System.out.println("Invalid type. Enter c or d.");
            }
        }

        System.out.println("\n--- Cats ---");
        for (Pet pet : pets) {
            if (pet instanceof Cat) {
                System.out.println("Name: " + pet.getName());
            }
        }

        System.out.println("\n--- Dogs ---");
        for (Pet pet : pets) {
            if (pet instanceof Dog) {
                System.out.println("Name: " + pet.getName());
            }
        }

        scanner.close();
    }
}
