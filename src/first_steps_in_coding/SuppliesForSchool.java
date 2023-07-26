package first_steps_in_coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SuppliesForSchool {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double  pensPrice = 5.80;
        double  markersPrice = 7.20;
        double  cleaningSolutionPrice = 1.20;

        double pensTotal=Integer.parseInt(reader.readLine())*pensPrice;
        double markersTotal=Integer.parseInt(reader.readLine())*markersPrice;
        double solutionTotal=Integer.parseInt(reader.readLine())*cleaningSolutionPrice;
        int discountPercent=Integer.parseInt(reader.readLine());

        System.out.println((pensTotal+markersTotal+solutionTotal)*(100-discountPercent)/100);
    }
}