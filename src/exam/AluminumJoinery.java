package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AluminumJoinery {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());
        String type = reader.readLine();
        String delivery = reader.readLine();

        double pricePerPiece = 0;

        if (count < 10) {
            System.out.println("Invalid order");
            return;
        }

        switch (type) {
            case "90X130":
                pricePerPiece = 110;

                if (count > 60) {
                    pricePerPiece *= 0.92;
                } else if (count > 30) {
                    pricePerPiece *= 0.95;
                }

                break;
            case "100X150":
                pricePerPiece = 140;

                if (count > 80) {
                    pricePerPiece *= 0.9;
                } else if (count > 40) {
                    pricePerPiece *= 0.94;
                }
                break;
            case "130X180":
                pricePerPiece = 190;

                if (count > 50) {
                    pricePerPiece *= 0.88;
                } else if (count > 20) {
                    pricePerPiece *= 0.93;
                }
                break;
            case "200X300":
                pricePerPiece = 250;

                if (count > 50) {
                    pricePerPiece *= 0.86;
                } else if (count > 25) {
                    pricePerPiece *= 0.91;
                }
                break;
        }
        double total = pricePerPiece * count;

        if ("With delivery".equals(delivery)) {
            total += 60;
        }

        if (count > 99) {
            total *= 0.96;
        }
        System.out.printf("%.2f BGN%n", total);
    }
}