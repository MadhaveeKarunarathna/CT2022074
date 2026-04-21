import javax.swing.*;
import java.util.Scanner;

public class Q2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String fname = scanner.next();
        System.out.println("Enter last name: ");
        String lname = scanner.next();
        String fullname = fname + " " + lname;

        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(800, 600);
        myWindow.setTitle(fullname);
        myWindow.setVisible(true);
    }
}
