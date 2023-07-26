package conditionals_advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewHouse {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String flowerName = reader.readLine();
        int count = Integer.parseInt(reader.readLine());
        double budget = Double.parseDouble(reader.readLine());

        switch (flowerName) {
            case "Roses":
                budget -= count * (count > 80 ? 5 * 0.9 : 5);
                break;
            case "Dahlias":
                budget -= count * (count > 90 ? 3.8 * 0.85 : 3.8);
                break;
            case "Tulips":
                budget -= count * (count > 80 ? 2.8 * 0.85 : 2.8);
                break;
            case "Narcissus":
                budget -= count * (count < 120 ? 3 * 1.15 : 3);
                break;
            case "Gladiolus":
                budget -= count * (count < 80 ? 2.5 * 1.2 : 2.5);
                break;
        }
        if (budget<0){
            System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(budget));
        }else {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.%n",count,flowerName,budget);
        }
    }
}