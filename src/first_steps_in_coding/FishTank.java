package first_steps_in_coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FishTank {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(reader.readLine());
        int width = Integer.parseInt(reader.readLine());
        int height = Integer.parseInt(reader.readLine());
        double percentOccupied = Double.parseDouble(reader.readLine());

        int aquariumVolume = length * width * height;

        System.out.println((aquariumVolume / 1000.0) * (100 - percentOccupied) / 100);
    }
}