import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q5 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");

        System.out.println(date.format(format));
    }
}
