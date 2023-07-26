package conditionals_advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cinema {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String type = reader.readLine();
        int row = Integer.parseInt(reader.readLine());
        int col = Integer.parseInt(reader.readLine());
        double income = 0;

        switch (type) {
            case "Premiere" -> income = row * col * 12;
            case "Normal" -> income = row * col * 7.50;
            case "Discount" -> income = row * col * 5;
            default -> System.out.println("No such projection!");
        }
        System.out.printf("%.2f leva", income);
    }
}