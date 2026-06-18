package Q6;

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

    static ArrayList<Pet> pets = new ArrayList<>();
    static ArrayList<Cat> cats = new ArrayList<>();
    static ArrayList<Dog> dogs = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Initial input phase
        System.out.println("Enter pets to start. Type STOP when done.");

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
                dogs.add(dog);

            } else if (type.equals("c")) {
                System.out.print("Coat color: ");
                String color = scanner.nextLine().trim();
                Cat cat = new Cat();
                cat.setName(name);
                cat.setCoatColor(color);
                pets.add(cat);
                cats.add(cat);

            } else {
                System.out.println("Invalid type. Try again.");
            }
        }

        // Menu loop
        int choice = -1;
        while (choice != 0) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("0. Quit");
            System.out.print("Choice: ");

            choice = Integer.parseInt(scanner.nextLine().trim());

            switch (choice) {
                case 1:
                    addCat();
                    break;
                case 2:
                    addDog();
                    break;
                case 3:
                    removeCat();
                    break;
                case 4:
                    removeDog();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            if (choice != 0) {
                displayAll();
            }
        }

        scanner.close();
    }

    static void addCat() {
        System.out.print("Cat name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Coat color: ");
        String color = scanner.nextLine().trim();

        Cat cat = new Cat();
        cat.setName(name);
        cat.setCoatColor(color);
        pets.add(cat);
        cats.add(cat);
        System.out.println("Cat added.");
    }

    static void addDog() {
        System.out.print("Dog name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Weight (kg): ");
        double weight = Double.parseDouble(scanner.nextLine().trim());

        Dog dog = new Dog();
        dog.setName(name);
        dog.setWeight(weight);
        pets.add(dog);
        dogs.add(dog);
        System.out.println("Dog added.");
    }

    static void removeCat() {
        System.out.print("Enter cat name to remove: ");
        String name = scanner.nextLine().trim();

        Cat toRemove = null;
        for (Cat cat : cats) {
            if (cat.getName().equalsIgnoreCase(name)) {
                toRemove = cat;
                break;
            }
        }

        if (toRemove != null) {
            cats.remove(toRemove);
            pets.remove(toRemove);
            System.out.println(name + " removed.");
        } else {
            System.out.println("Cat not found.");
        }
    }

    static void removeDog() {
        System.out.print("Enter dog name to remove: ");
        String name = scanner.nextLine().trim();

        Dog toRemove = null;
        for (Dog dog : dogs) {
            if (dog.getName().equalsIgnoreCase(name)) {
                toRemove = dog;
                break;
            }
        }

        if (toRemove != null) {
            dogs.remove(toRemove);
            pets.remove(toRemove);
            System.out.println(name + " removed.");
        } else {
            System.out.println("Dog not found.");
        }
    }

    static void displayAll() {
        System.out.println("\n--- Current Cats ---");
        if (cats.isEmpty()) {
            System.out.println("No cats.");
        } else {
            for (Cat cat : cats) {
                System.out.println("Name: " + cat.getName() + " | Coat Color: " + cat.getCoatColor());
            }
        }

        System.out.println("\n--- Current Dogs ---");
        if (dogs.isEmpty()) {
            System.out.println("No dogs.");
        } else {
            for (Dog dog : dogs) {
                System.out.printf("Name: %s | Weight: %.2f kg%n", dog.getName(), dog.getWeight());
            }
        }
    }
}
