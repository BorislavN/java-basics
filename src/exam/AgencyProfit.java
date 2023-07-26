package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AgencyProfit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String company = reader.readLine();
        int standardTickets = Integer.parseInt(reader.readLine());
        int childrenTickets = Integer.parseInt(reader.readLine());
        double netPrice = Double.parseDouble(reader.readLine());
        double tax = Double.parseDouble(reader.readLine());

        double standardTotal = (netPrice + tax) * standardTickets;
        double childrenTotal = (netPrice * 0.3 + tax) * childrenTickets;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.%n"
                , company
                , (standardTotal + childrenTotal) * 0.2);
    }
}