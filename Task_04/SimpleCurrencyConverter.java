import java.util.Scanner;

public class SimpleCurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Show available currencies
        System.out.println("Available currencies: USD, INR, EUR");

        // Step 1: Choose currencies
        System.out.print("Enter base currency (USD/INR/EUR): ");
        String base = sc.next().toUpperCase();

        System.out.print("Enter target currency (USD/INR/EUR): ");
        String target = sc.next().toUpperCase();

        // Step 2: Enter amount
        System.out.print("Enter amount in " + base + ": ");
        double amount = sc.nextDouble();

        // Step 3: Conversion rates (relative to USD)
        double usdRate = 1.0;
        double inrRate = 83.0;  // 1 USD = 83 INR
        double eurRate = 0.92;  // 1 USD = 0.92 EUR

        // Step 4: Convert base to USD
        double inUSD = 0;
        if (base.equals("USD")) inUSD = amount;
        else if (base.equals("INR")) inUSD = amount / inrRate;
        else if (base.equals("EUR")) inUSD = amount / eurRate;
        else {
            System.out.println("Invalid base currency!");
            return;
        }

        // Step 5: Convert USD to target
        double result = 0;
        if (target.equals("USD")) result = inUSD;
        else if (target.equals("INR")) result = inUSD * inrRate;
        else if (target.equals("EUR")) result = inUSD * eurRate;
        else {
            System.out.println("Invalid target currency!");
            return;
        }

        // Step 6: Show result
        System.out.printf("%.2f %s = %.2f %s\n", amount, base, result, target);

        sc.close();
    }
}
