package for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TennisRankList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int competitions = Integer.parseInt(reader.readLine());
        int initialPoints = Integer.parseInt(reader.readLine());
        int points = 0;
        int wins=0;

        for (int i = 0; i < competitions; i++) {
            String result = reader.readLine();

            switch (result) {
                case "W":
                    points += 2000;
                    wins++;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;
            }
        }
        System.out.printf("Final points: %d%n",points+initialPoints);
        System.out.printf("Average points: %d%n",points/competitions);
        System.out.printf("%.2f%%%n",wins*1.0/competitions*100);
    }
}