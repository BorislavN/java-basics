package nested_loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberPyramid {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number=Integer.parseInt(reader.readLine());
        int current=1;

//        for (int row = 0; row <=number; row++) {
//            int colCount=number*2+1;
//
//            for (int col = 0; col < colCount; col++) {
//                int middleIndex=(colCount-1)/2;
//
//                if (col<(middleIndex-row)||col>(middleIndex+row)){
//                    System.out.print("_");
//                }else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println("");
//        }

        for (int row = 1; row <=number; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(current++ +" ");
                if (current-1==number){
                    return;
                }
            }
            System.out.println("");
        }
    }
}