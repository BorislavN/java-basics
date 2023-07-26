package nested_loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int primeSum = 0;
        int nonPrimeSum = 0;
        String line = "";

        while (!"stop".equals(line = reader.readLine())) {
            int number = Integer.parseInt(line);
            boolean isPrime = true;
            int counter = 2;

            if (number < 0) {
                System.out.println("Number is negative.");
                continue;
            }

            if (number == 1 || number == 0) {
                isPrime = false;
            }

            while (counter < number && isPrime) {
                if (number % counter++ == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                primeSum += number;
            } else {
                nonPrimeSum += number;
            }
        }
        System.out.printf("Sum of all prime numbers is: %d%n",primeSum);
        System.out.printf("Sum of all non prime numbers is: %d%n",nonPrimeSum);
    }
}