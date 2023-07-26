package conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GodzillaVsKong {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double budget = Double.parseDouble(reader.readLine());
        int crew = Integer.parseInt(reader.readLine());
        double outfitPrice = Double.parseDouble(reader.readLine());

        double totalOutfitCost = crew * outfitPrice;

        if (crew > 150) {
            totalOutfitCost *= 0.9;
        }

        budget = (budget * 0.9) - totalOutfitCost;

        if (budget < 0) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.%n", Math.abs(budget));
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.%n", budget);
        }
    }
}