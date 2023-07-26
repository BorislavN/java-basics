package for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Oscars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String actor = reader.readLine();
        double score = Double.parseDouble(reader.readLine());
        int juryCount = Integer.parseInt(reader.readLine());

        for (int i = 0; i < juryCount; i++) {
            String juryName = reader.readLine();
            double points = Double.parseDouble(reader.readLine());

            score += (juryName.length() * points) / 2;

            if (score > 1250.5) {
                break;
            }
        }
        if (score <= 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!%n", actor, 1250.5 - score);
        } else {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!%n"
                    , actor
                    , score);
        }
    }
}