package for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Salary {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tabs = Integer.parseInt(reader.readLine());
        int salary = Integer.parseInt(reader.readLine());

        for (int i = 0; i < tabs; i++) {
            String tab = reader.readLine();

            switch (tab) {
                case "Facebook" -> salary -= 150;
                case "Instagram" -> salary -= 100;
                case "Reddit" -> salary -= 50;
            }
        }
        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}