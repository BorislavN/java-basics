package conditionals_advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperationsBetweenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int firstNum = Integer.parseInt(reader.readLine());
        int secondNum = Integer.parseInt(reader.readLine());
        String operator = reader.readLine();
        double result = 0;

        switch (operator) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                result = (1.0 * firstNum) / secondNum;
                break;
            case "%":
                result = (1.0 * firstNum) % secondNum;
                break;
        }

        if (Double.isNaN(result)) {
            System.out.printf("Cannot divide %d by zero%n", firstNum);
        } else {
            String divisionString = String.format("%.2f", result);
            System.out.printf("%d %s %d = %s"
                    , firstNum
                    , operator
                    , secondNum
                    , "/".equals(operator) ? divisionString : Math.round(result));

            if (!"/".equals(operator) && !"%".equals(operator)) {
                System.out.printf(" - %s%n", result % 2 == 0 ? "even" : "odd");
            }
        }
    }
}