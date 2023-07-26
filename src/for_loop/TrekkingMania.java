package for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrekkingMania {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int musalaCount = 0;
        int montBlancCount = 0;
        int kilimanjaroCount = 0;
        int k2Count = 0;
        int everestCount = 0;

        int groups = Integer.parseInt(reader.readLine());
        int totalPeople=0;

        for (int i = 0; i < groups; i++) {
            int people = Integer.parseInt(reader.readLine());
            totalPeople+=people;

            if (people <= 5) {
                musalaCount+=people;
            } else if (people <= 12) {
                montBlancCount+=people;
            } else if (people <= 25) {
                kilimanjaroCount+=people;
            } else if (people <= 40) {
                k2Count+=people;
            } else {
                everestCount+=people;
            }
        }
        System.out.printf("%.2f%%%n",musalaCount*1.0/totalPeople*100);
        System.out.printf("%.2f%%%n",montBlancCount*1.0/totalPeople*100);
        System.out.printf("%.2f%%%n",kilimanjaroCount*1.0/totalPeople*100);
        System.out.printf("%.2f%%%n",k2Count*1.0/totalPeople*100);
        System.out.printf("%.2f%%%n",everestCount*1.0/totalPeople*100);
    }
}