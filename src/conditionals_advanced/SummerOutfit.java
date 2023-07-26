package conditionals_advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummerOutfit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int degrees = Integer.parseInt(reader.readLine());
        String time = reader.readLine();

        boolean cold = degrees >= 10 && degrees <= 18;
        boolean warm = degrees > 18 && degrees <= 24;

        String outfit = "";
        String shoes = "";

        switch (time) {
            case "Morning":
                if (cold) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (warm) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (cold) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (warm) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                outfit = "Shirt";
                shoes = "Moccasins";
                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.%n", degrees, outfit, shoes);
    }
}