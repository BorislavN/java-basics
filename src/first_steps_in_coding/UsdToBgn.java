package first_steps_in_coding;

import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());

        System.out.println(input * 1.79549);
    }
}