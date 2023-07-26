package first_steps_in_coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VacationBooksList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int bookPages =Integer.parseInt(reader.readLine());
        int pagesPerHour =Integer.parseInt(reader.readLine());
        int days=Integer.parseInt(reader.readLine());

        int hours = bookPages/pagesPerHour;
        System.out.println(hours/days);
    }
}
