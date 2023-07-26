package conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToyShop {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final double puzzlePrice = 2.6;
        final double dollPrice = 3;
        final double bearPrice = 4.10;
        final double minionPrice = 8.2;
        final double truckPrice = 2;

        double vacationPrice = Double.parseDouble(reader.readLine());
        int puzzles = Integer.parseInt(reader.readLine());
        int dolls = Integer.parseInt(reader.readLine());
        int bears = Integer.parseInt(reader.readLine());
        int minions = Integer.parseInt(reader.readLine());
        int trucks = Integer.parseInt(reader.readLine());

        int totalToys = puzzles + dolls + bears + minions + trucks;

        double discount = totalToys >= 50 ? 0.75 : 1;

        double profit = (puzzles * puzzlePrice
                + dolls * dollPrice
                + bears * bearPrice
                + minions * minionPrice
                + trucks * truckPrice)
                * discount
                * 0.9;//for rent


        if (profit >= vacationPrice) {
            System.out.printf("Yes! %.2f lv left.%n", profit - vacationPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.%n", vacationPrice - profit);
        }
    }
}