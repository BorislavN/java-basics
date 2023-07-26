package nested_loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CinemaTickets {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String movie;
        int totalTickets = 0;
        int totalKidTickets = 0;
        int totalStandardTickets = 0;
        int totalStudentTickets = 0;

        while (!"Finish".equals(movie = reader.readLine())) {
            int capacity = Integer.parseInt(reader.readLine());
            int takenSeats = 0;
            String ticket;

            while (takenSeats < capacity && !"End".equals(ticket = reader.readLine())) {
                totalTickets++;
                takenSeats++;

                switch (ticket) {
                    case "kid":
                        totalKidTickets++;
                        break;
                    case "standard":
                        totalStandardTickets++;
                        break;
                    case "student":
                        totalStudentTickets++;
                        break;
                }
            }
            System.out.printf("%s - %.2f%% full.%n"
                    , movie
                    , takenSeats * 1.0 / capacity * 100);
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", totalStudentTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", totalStandardTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", totalKidTickets * 1.0 / totalTickets * 100);
    }
}