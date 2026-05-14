import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int smallest;
        if (a <= b && a <= c) smallest = a;
        else if (b <= a && b <= c) smallest = b;
        else smallest = c;

        System.out.println("Smallest: " + smallest);
    }
}
