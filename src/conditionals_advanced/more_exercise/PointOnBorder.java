package conditionals_advanced.more_exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PointOnBorder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double x1 = Double.parseDouble(reader.readLine());
        double y1 = Double.parseDouble(reader.readLine());
        double x2 = Double.parseDouble(reader.readLine());
        double y2 = Double.parseDouble(reader.readLine());
        double pointX = Double.parseDouble(reader.readLine());
        double pointY = Double.parseDouble(reader.readLine());

        boolean checkXAxis = (pointX == x1 || pointX == x2) && (pointY >= y1 && pointY <= y2);
        boolean checkYAxis = (pointY == y1 || pointY == y2) && (pointX >= x1 && pointX <= x2);

        System.out.println((checkXAxis || checkYAxis) ? "Border" : "Inside / Outside");
    }
}