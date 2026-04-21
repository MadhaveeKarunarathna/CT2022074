import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string with ! : ");
        String text = input.nextLine();

        int index = text.indexOf('!');

        String part1 = text.substring(0, index).trim();
        String part2 = text.substring(index + 1).trim();

        System.out.println(part1);
        System.out.println(part2);
    }
}

