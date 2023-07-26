package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BestPlayer {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name;
        String bestPlayer = "";
        int bestScore = Integer.MIN_VALUE;
        boolean didAHatTrick = false;

        while (!"END".equals(name = reader.readLine())) {
            int goals = Integer.parseInt(reader.readLine());

            if (goals > bestScore) {
                bestScore = goals;
                bestPlayer = name;
                didAHatTrick = goals >= 3;
            }

            if (goals >=10) {
                break;
            }
        }
        System.out.printf("%s is the best player!%n"
                , bestPlayer);

        System.out.printf("He has scored %d goals%s%n"
                , bestScore
                , didAHatTrick ? " and made a hat-trick !!!" : ".");
    }
}