package conditionals_advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Journey {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double budget = Double.parseDouble(reader.readLine());
        String season = reader.readLine();

        String place = "summer".equals(season) ? "Camp" : "Hotel";
        String destination;
        double cost;

        if (budget <= 100) {
            cost = "summer".equals(season) ? budget * 0.3 : budget * 0.7;
            destination = "Bulgaria";
        } else if (budget <= 1000) {
            cost = "summer".equals(season) ? budget * 0.4 : budget * 0.8;
            destination = "Balkans";
        } else {
            cost = budget * 0.9;
            destination = "Europe";
            place = "Hotel";
        }
        System.out.printf("Somewhere in %s%n%s - %.2f%n", destination, place, cost);
    }
}