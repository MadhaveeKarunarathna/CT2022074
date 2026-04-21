import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter width: ");
        int width = input.nextInt();

        System.out.print("Enter height: ");
        int height = input.nextInt();
        input.nextLine(); // clear buffer

        System.out.print("Enter title: ");
        String title = input.nextLine();

        JFrame frame = new JFrame();
        frame.setSize(width, height);
        frame.setTitle(title);
        frame.setVisible(true);
    }
}
