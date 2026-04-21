import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        int middleIndex = word.length() / 2;

        char middle = word.charAt(middleIndex);

        System.out.println(middle);
    }
}

