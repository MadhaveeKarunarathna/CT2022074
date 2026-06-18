package Q1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Buddy");

        Cat cat = new Cat();
        cat.setName("Whiskers");

        System.out.println(dog.getName() + " says: " + dog.speak());
        System.out.println(cat.getName() + " says: " + cat.speak());
    }
}
