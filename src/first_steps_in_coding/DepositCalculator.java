package first_steps_in_coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DepositCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double deposit = Double.parseDouble(reader.readLine());
        int months = Integer.parseInt(reader.readLine());
        double yearlyInterestRate = Double.parseDouble(reader.readLine());

        double yearlyInterest = deposit*(yearlyInterestRate/100);

        System.out.println(deposit+months*(yearlyInterest/12));
    }
}