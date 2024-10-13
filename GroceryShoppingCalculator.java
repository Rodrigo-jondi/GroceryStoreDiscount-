/*
Jondi Ylija P. Rodrigo
September 20,2024
GroceryShoppingCalculator
*/
import java.util.Scanner;

public class GroceryShoppingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new         Scanner(System.in);
        double discountRate = 0.05;  // 5% discount
        double salesTaxRate = 0.12;  // 12% sales tax

        // Variables to hold item details
        double totalCost = 0.0;
        double price, itemTotal;
        int quantity;

        // Loop through 3 items
        for (int i = 1; i <= 3; i++) {
            System.out.println("Item " + i + ":");
            System.out.print("Enter the price of the item: PHP");
            price = scanner.nextDouble();

            System.out.print("Enter the quantity of the item: ");
            quantity = scanner.nextInt();

            // Calculate the cost for this item
            itemTotal = price * quantity;
            totalCost += itemTotal;

            System.out.println("Cost for item " + i + ": PHP" + itemTotal + "\n");
        }

        // Calculate subtotal
        double subtotal = totalCost;
        System.out.println("Subtotal: PHP" + subtotal);

        // Apply discount
        double discount = subtotal * discountRate;
        double discountedTotal = subtotal - discount;
        System.out.println("Discount (5%): PHP" + discount);

        // Apply sales tax
        double salesTax = discountedTotal * salesTaxRate;
        double finalTotal = discountedTotal + salesTax;
        System.out.println("Sales Tax (12%): +PHP" + salesTax);

        // Display final total
        System.out.println("\nFinal Total: PHP" + finalTotal);
    }
}
