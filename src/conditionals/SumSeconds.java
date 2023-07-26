package conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumSeconds {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int firstPerson = Integer.parseInt(reader.readLine());
        int secondPerson = Integer.parseInt(reader.readLine());
        int thirdPerson = Integer.parseInt(reader.readLine());

        int total = firstPerson + secondPerson + thirdPerson;

        System.out.printf("%d:%02d%n", total / 60, total % 60);
    }
}