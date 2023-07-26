package conditionals_advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FishingBoat {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int budget = Integer.parseInt(reader.readLine());
        String season = reader.readLine();
        int fishermenCount = Integer.parseInt(reader.readLine());
        double discount = 1;
        double cost = 0;

        if (fishermenCount <= 6) {
            discount = 0.9;
        } else if (fishermenCount <= 11) {
            discount = 0.85;
        } else {
            discount = 0.75;
        }

        if (fishermenCount % 2 == 0 && !"Autumn".equals(season)) {
            discount *= 0.95;
        }

        switch (season) {
            case "Winter" -> cost = 2600 * discount;
            case "Spring" -> cost = 3000 * discount;
            case "Summer", "Autumn" -> cost = 4200 * discount;
        }
        if (budget < cost) {
            System.out.printf("Not enough money! You need %.2f leva.%n", cost - budget);
        } else {
            System.out.printf("Yes! You have %.2f leva left.%n", budget - cost);
        }
    }
}