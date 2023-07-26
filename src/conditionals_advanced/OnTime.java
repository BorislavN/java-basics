package conditionals_advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnTime {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int examHour = Integer.parseInt(reader.readLine());
        int examMinutes = Integer.parseInt(reader.readLine());
        int arrivalHour = Integer.parseInt(reader.readLine());
        int arrivalMinutes = Integer.parseInt(reader.readLine());

        int examMinuteSum = examHour * 60 + examMinutes;
        int arrivalMinuteSum = arrivalHour * 60 + arrivalMinutes;
        int difference = examMinuteSum - arrivalMinuteSum;

        int hours = Math.abs(difference) / 60;
        int minutes = Math.abs(difference) % 60;

        String minutesOutput = String.format("%d", minutes);
        String timeOutput = String.format("%d:%02d", hours, minutes);
        String message;

        if (difference < 0) {
            message = String.format("Late%n%s %s after the start%n"
                    , hours == 0 ? minutesOutput : timeOutput
                    , hours == 0 ? "minutes" : "hours");

        } else if (difference <= 30) {
            message = String.format("On time%n%s%n"
                    , minutes == 0 ? "" : minutesOutput + " minutes before the start");

        } else {
            message = String.format("Early%n%s %s before the start%n"
                    , hours == 0 ? minutesOutput : timeOutput
                    , hours == 0 ? "minutes" : "hours");
        }
        System.out.printf(message);
    }
}