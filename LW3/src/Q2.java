import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0.Magenta\n1.Cyan\n2.Red\n3.Blue\n4.Green");
        System.out.print("Select one color: ");
        int selection = sc.nextInt();

        switch (selection) {
            case 0: System.out.println("You selected Magenta"); break;
            case 1: System.out.println("You selected Cyan"); break;
            case 2: System.out.println("You selected Red"); break;
            case 3: System.out.println("You selected Blue"); break;
            case 4: System.out.println("You selected Green"); break;
            default: System.out.println("Invalid selection");
        }
    }
}
