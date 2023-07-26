package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BarcodeGenerator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String startDigitsRange = reader.readLine();
        String endDigitsRange = reader.readLine();

        int firstStart = Character.getNumericValue(startDigitsRange.charAt(0));
        int secondStart = Character.getNumericValue(startDigitsRange.charAt(1));
        int thirdStart = Character.getNumericValue(startDigitsRange.charAt(2));
        int fourthStart = Character.getNumericValue(startDigitsRange.charAt(3));

        int firstEnd = Character.getNumericValue(endDigitsRange.charAt(0));
        int secondEnd = Character.getNumericValue(endDigitsRange.charAt(1));
        int thirdEnd = Character.getNumericValue(endDigitsRange.charAt(2));
        int fourthEnd = Character.getNumericValue(endDigitsRange.charAt(3));

        for (int first = firstStart; first <= firstEnd; first++) {
            if (first % 2 != 0) {
                for (int second = secondStart; second <= secondEnd; second++) {
                    if (second % 2 != 0) {
                        for (int third = thirdStart; third <= thirdEnd; third++) {
                            if (third % 2 != 0) {
                                for (int fourth = fourthStart; fourth <= fourthEnd; fourth++) {
                                    if (fourth % 2 != 0) {
                                        System.out.printf("%d%d%d%d ", first, second, third, fourth);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}