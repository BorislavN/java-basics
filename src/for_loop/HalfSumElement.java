package for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HalfSumElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int lines = Integer.parseInt(reader.readLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < lines; i++) {
            int input = Integer.parseInt(reader.readLine());

            sum += input;

            if (max < input) {
                max = input;
            }
        }
        int partialSum = sum - max;

        if (partialSum == max) {
            System.out.printf("Yes%nSum = %d%n", max);
        } else {
            System.out.printf("No%nDiff = %d%n", Math.abs(max - partialSum));
        }
    }
}