package conditionals_advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HotelRoom {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String month = reader.readLine();
        int days = Integer.parseInt(reader.readLine());

        double studioDiscount = 1;
        double apartmentDiscount = 1;
        double apartmentPrice = 0;
        double studioPrice = 0;

        if (days > 14) {
            apartmentDiscount = 0.9;
        }

        switch (month) {
            case "May", "October" -> {
                if (days > 7 && days <= 14) {
                    studioDiscount = 0.95;
                } else if (days > 14) {
                    studioDiscount = 0.70;
                }
                apartmentPrice = 65f * days * apartmentDiscount;
                studioPrice = 50f * days * studioDiscount;
            }
            case "June", "September" -> {
                studioDiscount = days > 14 ? 0.80 : 1;
                apartmentPrice = 68.70 * days * apartmentDiscount;
                studioPrice = 75.20 * days * studioDiscount;
            }
            case "July", "August" -> {
                apartmentPrice = 77f * days * apartmentDiscount;
                studioPrice = 76f * days * studioDiscount;
            }
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.%n"
                , apartmentPrice
                , studioPrice );
    }
}