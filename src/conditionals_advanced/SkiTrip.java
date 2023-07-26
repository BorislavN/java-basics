package conditionals_advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SkiTrip {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int days = Integer.parseInt(reader.readLine()) - 1;
        String type = reader.readLine();
        String review = reader.readLine();

        double discount = 1;
        double dailyCost = 0;

        switch (type) {
            case "room for one person":
                dailyCost = 18;
                break;
            case "apartment":
                dailyCost = 25;

                if (days < 10) {
                    discount = 0.7;
                } else if (days <= 15) {
                    discount = 0.65;
                } else {
                    discount = 0.5;
                }
                break;
            case "president apartment":
                dailyCost = 35;

                if (days < 10) {
                    discount = 0.9;
                } else if (days <= 15) {
                    discount = 0.85;
                } else {
                    discount = 0.8;
                }
                break;
        }
        System.out.printf("%.2f%n"
                , (dailyCost * days * discount) * ("positive".equals(review) ? 1.25 : 0.9));
    }
}