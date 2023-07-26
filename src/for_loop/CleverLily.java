package for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CleverLily {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int age = Integer.parseInt(reader.readLine());
        double washingMachinePrice = Double.parseDouble(reader.readLine());
        int toyPrice = Integer.parseInt(reader.readLine());

        double sum = 0;
        int evenBDayMoney = 10;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                sum += evenBDayMoney - 1;
                evenBDayMoney += 10;
            } else {
                sum += toyPrice;
            }
        }
        System.out.printf("%s! %.2f%n"
                , sum >= washingMachinePrice ? "Yes" : "No"
                , Math.abs(sum - washingMachinePrice));
    }
}