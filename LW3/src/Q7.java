import java.util.Scanner;

public class Q7 {
    static int countDigits(int n) {
        if (n == 0) return 1;
        n = Math.abs(n);
        int count = 0;
        while (n > 0) { n /= 10; count++; }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer (negative to stop): ");
            int n = sc.nextInt();
            if (n < 0) break;
            System.out.println("Digits: " + countDigits(n));
        }
    }
}
