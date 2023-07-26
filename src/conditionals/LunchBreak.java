package conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LunchBreak {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String seriesName = reader.readLine();
        int episodeDuration = Integer.parseInt(reader.readLine());
        double breakDuration = Double.parseDouble(reader.readLine());

        double lunchTime = breakDuration / 8.0;
        double restTime = breakDuration / 4.0;

        breakDuration -= (episodeDuration + lunchTime + restTime);

        if (breakDuration < 0) {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.%n"
                    , seriesName
                    , Math.ceil(Math.abs(breakDuration)));
        } else {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.%n"
                    , seriesName
                    , Math.ceil(breakDuration));
        }

    }
}