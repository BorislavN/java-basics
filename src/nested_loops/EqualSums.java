package nested_loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EqualSums {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int start =Integer.parseInt(reader.readLine());
        int finish=Integer.parseInt(reader.readLine());

        for (int i = start; i <= finish; i++) {
            String number=String.valueOf(i);
            int evenSum=0;
            int oddSum=0;

            for (int position = 1; position <=number.length() ; position++) {

                int value = Character.getNumericValue(number.charAt(position - 1));

                if (position%2==0){
                    evenSum+= value;
                }else {
                    oddSum+= value;
                }
            }
            if (evenSum==oddSum){
                System.out.print(number+" ");
            }
        }

    }
}