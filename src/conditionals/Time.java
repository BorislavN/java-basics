package conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Time {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int hours = Integer.parseInt(reader.readLine());
        int minutes = Integer.parseInt(reader.readLine());

        int totalMinutes = hours * 60 + minutes + 15;
        int finalHours = totalMinutes / 60;

        System.out.printf("%d:%02d%n", finalHours == 24 ? 0 : finalHours, totalMinutes % 60);
    }
}