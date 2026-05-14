import java.util.Scanner;

public class Q5 {
    static String[][] items = {
            {"Tofu Burger", "Cajun Chicken", "Buffalo Wings", "Rainbow Fillet"},
            {"Rice Cracker", "No-Salt Fries", "Zucchini", "Brown Rice"},
            {"Cafe Mocha", "Cafe Latte", "Espresso", "Oolong Tea"}
    };
    static double[][] prices = {
            {3.49, 4.59, 3.99, 2.99},
            {0.79, 0.69, 1.09, 0.59},
            {1.99, 1.90, 2.49, 0.99}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] orderedItems = new String[50];
        double[] orderedPrices = new double[50];
        int[] orderedQty = new int[50];
        int orderCount = 0;

        while (true) {
            System.out.println("\n--- Categories ---");
            System.out.println("1. Entree  2. Side Dish  3. Drink  0. Checkout");
            System.out.print("Choose category: ");
            int cat = sc.nextInt();
            if (cat == 0) break;
            if (cat < 1 || cat > 3) { System.out.println("Invalid."); continue; }

            int c = cat - 1;
            System.out.println("\n--- " + (cat == 1 ? "Entree" : cat == 2 ? "Side Dish" : "Drink") + " ---");
            for (int i = 0; i < items[c].length; i++)
                System.out.printf("%d. %-20s $%.2f%n", i + 1, items[c][i], prices[c][i]);

            System.out.print("Enter item number: ");
            int item = sc.nextInt() - 1;
            if (item < 0 || item >= items[c].length) { System.out.println("Invalid."); continue; }

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            orderedItems[orderCount] = items[c][item];
            orderedPrices[orderCount] = prices[c][item];
            orderedQty[orderCount] = qty;
            orderCount++;
            System.out.println("Added to order.");
        }

        System.out.println("\n========= ORDER SUMMARY =========");
        System.out.printf("%-20s %6s %5s %8s%n", "Item", "Price", "Qty", "Subtotal");
        System.out.println("---------------------------------");
        double total = 0;
        for (int i = 0; i < orderCount; i++) {
            double sub = orderedPrices[i] * orderedQty[i];
            System.out.printf("%-20s $%5.2f %5d  $%6.2f%n",
                    orderedItems[i], orderedPrices[i], orderedQty[i], sub);
            total += sub;
        }
        System.out.println("---------------------------------");
        System.out.printf("%-20s %14s$%6.2f%n", "TOTAL", "", total);
    }
}
