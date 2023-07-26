package conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BonusScore {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        double bonus;

        if (100 >= number) {
            bonus = 5;
        } else if (1000 > number) {
            bonus = number * 0.2;
        } else {
            bonus = number * 0.1;
        }

        if (number%2==0){
            bonus+=1;
        } else if (number%10==5) {
            bonus+=2;
        }

        System.out.println(bonus);
        System.out.println(bonus+number);
    }
}