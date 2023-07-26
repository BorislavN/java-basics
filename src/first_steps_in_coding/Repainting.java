package first_steps_in_coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repainting {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double nylonPrice = 1.50;
        double paintPrice = 14.50;
        double dyeReducerPrice = 5;
        double bags = 0.40;

        double nylonTotal = (Integer.parseInt(reader.readLine())+2) * nylonPrice;
        double paintTotal = Integer.parseInt(reader.readLine()) * paintPrice * 1.10;
        double dyeReducerTotal = Integer.parseInt(reader.readLine()) * dyeReducerPrice;
        int hours = Integer.parseInt(reader.readLine());

        double total = nylonTotal + paintTotal + dyeReducerTotal + bags;

        System.out.println(total + (total * 0.3) * hours);
    }
}