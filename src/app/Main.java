package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть суму покупки: ");
        double purchaseAmount = scanner.nextDouble();

        double discount = calculateDiscount(purchaseAmount);
        double totalAmount = calculateTotalAmount(purchaseAmount);

        displayInformation(purchaseAmount, discount, totalAmount);
    }
    private static double calculateDiscount(double amount) {
        if (amount <= 5000) {
            return amount * 0.05;
        } else if (amount <= 10000) {
            return amount * 0.10;
        } else {
            return amount * 0.15;
        }
    }
    private static double calculateTotalAmount(double amount) {
        return amount - calculateDiscount(amount);
    }
    private static void displayInformation(double purchaseAmount, double discount, double totalAmount) {
        System.out.println("Загальна сума покупки: " + formatCurrency(purchaseAmount) + "\n" +
                "Сума знижки: " + formatCurrency(discount) + "\n" +
                "Сума до оплати: " + formatCurrency(totalAmount));

    }
    private static String formatCurrency(double amount) {
        return String.format("%.2f", amount);
    }
}
