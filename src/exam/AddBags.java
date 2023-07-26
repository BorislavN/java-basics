package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddBags {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double luggagePrice = Double.parseDouble(reader.readLine());
        double weight = Double.parseDouble(reader.readLine());
        int daysBeforeDeparture = Integer.parseInt(reader.readLine());
        int luggageCount = Integer.parseInt(reader.readLine());

        if (weight < 10) {
            luggagePrice *= 0.2;
        } else if (weight <= 20) {
            luggagePrice *= 0.5;
        }

        if (daysBeforeDeparture < 7) {
            luggagePrice *= 1.4;
        } else if (daysBeforeDeparture <= 30) {
            luggagePrice *= 1.15;
        } else {
            luggagePrice *= 1.1;
        }

        System.out.printf("The total price of bags is: %.2f lv.%n"
                , luggagePrice * luggageCount);
    }
}