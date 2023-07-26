package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Walking {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        final int goal = 10_000;
        int steps = 0;

        while (!"Going home".equals(line = reader.readLine())) {
            steps += Integer.parseInt(line);

            if (steps >= goal) {
                System.out.printf("Goal reached! Good job!%n%d steps over the goal!%n", steps - goal);
                return;
            }
        }
        steps += Integer.parseInt(reader.readLine());

        if (steps >= goal) {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!%n", steps - goal);
        } else {
            System.out.printf("%d more steps to reach goal.", goal - steps);
        }
    }
}