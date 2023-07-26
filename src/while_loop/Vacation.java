package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vacation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double vacationCost = Double.parseDouble(reader.readLine());
        double savings = Double.parseDouble(reader.readLine());

        int days = 0;
        int spendCount=0;


        while (savings < vacationCost) {
            String action = reader.readLine();
            double amount = Double.parseDouble(reader.readLine());

            days++;

            if ("spend".equals(action)) {
                savings = Math.max(0, savings - amount);
                spendCount++;

                if (spendCount==5) {
                    System.out.printf("You can't save the money.%n%d%n", days);
                    return;
                }
                continue;
            }
            savings += amount;
            spendCount=0;
        }
        System.out.printf("You saved the money for %d days.", days);
    }
}