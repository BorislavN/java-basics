package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExamPreparation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int poorGradeLimit = Integer.parseInt(reader.readLine());

        String line;
        String exerciseName="";
        int problemsCount = 0;
        double gradeTotal = 0;
        int poorGradesCount = 0;

        while (!"Enough".equals(line = reader.readLine())) {
            exerciseName = line;
            int grade = Integer.parseInt(reader.readLine());

            gradeTotal += grade;
            problemsCount++;

            if (grade <= 4) {
                poorGradesCount++;

                if (poorGradeLimit == poorGradesCount) {
                    System.out.printf("You need a break, %d poor grades.%n", poorGradeLimit);
                    return;
                }
            }
        }
        System.out.printf("Average score: %.2f%n", gradeTotal / problemsCount);
        System.out.printf("Number of problems: %d%n", problemsCount);
        System.out.printf("Last problem: %s%n", exerciseName);
    }
}