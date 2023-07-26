package nested_loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

        for (int i = 1111; i < 9999; i++) {
            String magicNumber = String.valueOf(i);
            boolean isSpecial = true;

            for (int index = 0; index < magicNumber.length(); index++) {
                int numAtIndex = Character.getNumericValue(magicNumber.charAt(index));

                if (numAtIndex==0||num % numAtIndex != 0){
                    isSpecial = false;
                    break;
                }
            }
            if (isSpecial) {
                System.out.print(magicNumber+" ");
            }
        }
    }
}