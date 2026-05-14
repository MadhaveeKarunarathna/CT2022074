import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Word to replace: ");
        String oldWord = sc.nextLine();
        System.out.print("Replacement word: ");
        String newWord = sc.nextLine();
        System.out.println("Result: " + sentence.replace(oldWord, newWord));
    }
}
