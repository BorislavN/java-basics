package conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shopping {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final double cardPrice = 250;

        double budget = Double.parseDouble(reader.readLine());
        int cardNumber = Integer.parseInt(reader.readLine());
        int processorNumber = Integer.parseInt(reader.readLine());
        int ramNumber = Integer.parseInt(reader.readLine());

        double totalVideoCardSum = cardNumber * cardPrice;

        double total = totalVideoCardSum
                + (totalVideoCardSum * 0.35 * processorNumber)
                + (totalVideoCardSum * 0.1 * ramNumber);

        if (cardNumber > processorNumber) {
            total *= 0.85;
        }

        if (total <= budget) {
            System.out.printf("You have %.2f leva left!%n", budget - total);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!%n", total - budget);
        }
    }
}