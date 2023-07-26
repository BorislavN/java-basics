package conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorldSwimmingRecord {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double record = Double.parseDouble(reader.readLine());
        double distance = Double.parseDouble(reader.readLine());
        double pace = Double.parseDouble(reader.readLine());

        double gainedTime = Math.floor(distance / 15) * 12.5;
        double ivanTime = distance * pace + gainedTime;

        if (record<=ivanTime){
            System.out.printf("No, he failed! He was %.2f seconds slower.%n",ivanTime-record);
        }else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.%n",ivanTime);
        }
    }
}