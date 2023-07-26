package nested_loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrainTheTrainers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int juryCount = Integer.parseInt(reader.readLine());
        String line;
        double gradeTotal=0;
        int presentationCount = 0;

        while (!"Finish".equals(line = reader.readLine())) {
            double presentationGrades=0;

            for (int i = 0; i < juryCount; i++) {
                double grade = Double.parseDouble(reader.readLine());

                presentationGrades+=grade;
                gradeTotal+=grade;
            }
            System.out.printf("%s - %.2f.%n",line,presentationGrades/juryCount);
            presentationCount++;
        }
        System.out.printf("Student's final assessment is %.2f.%n"
                ,gradeTotal/(presentationCount*juryCount));
    }
}