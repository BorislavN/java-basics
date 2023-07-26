package for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Histogram {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int lines = Integer.parseInt(reader.readLine());
        int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;

        for (int i = 0; i < lines; i++) {
            int number = Integer.parseInt(reader.readLine());

            if (number < 200) {
                p1++;
                continue;
            }

            if (number < 400) {
                p2++;
                continue;
            }

            if (number < 600) {
                p3++;
                continue;
            }

            if (number < 800) {
                p4++;
                continue;
            }
            p5++;//only probability left is that the number is p5
        }
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n"
                , p1 * 1.0 / lines * 100
                , p2 * 1.0 / lines * 100
                , p3 * 1.0 / lines * 100
                , p4 * 1.0 / lines * 100
                , p5 * 1.0 / lines * 100);
    }
}