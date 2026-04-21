import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String fullName = input.nextLine();

        String[] parts = fullName.split(" ");

        String first = parts[0];
        String middle = parts[1];
        String last = parts[2];

        char middleInitial = middle.charAt(0);

        System.out.println(last + ", " + first + " " + middleInitial + ".");
    }
}

