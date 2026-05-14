import java.util.Scanner;
import java.util.Random;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = new Random().nextInt(100) + 1;
        int guess;
        do {
            System.out.print("Guess (1-100): ");
            guess = sc.nextInt();
            if (guess < target) System.out.println("Higher");
            else if (guess > target) System.out.println("Lower");
            else System.out.println("Correct!");
        } while (guess != target);
    }
}
