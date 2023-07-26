package first_steps_in_coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasketballEquipment {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tax =Integer.parseInt(reader.readLine());

        double shoes =tax*0.6;
        double clothes=shoes*0.8;
        double ball = clothes*0.25;
        double accessories = ball*0.20;

        System.out.println(shoes+clothes+ball+accessories+tax);
    }
}
