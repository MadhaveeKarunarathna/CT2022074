import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        int length = text.length();
        char first = text.charAt(0);
        char last = text.charAt(length - 1);

        System.out.println(length);
        System.out.println(first);
        System.out.println(last);
    }
}

