package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Balls {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int ballsCount = Integer.parseInt(reader.readLine());
        int points = 0;

        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int blackBalls = 0;
        int otherBalls = 0;

        for (int i = 0; i < ballsCount; i++) {
            String ball = reader.readLine();

            switch (ball) {
                case "red":
                    points += 5;
                    redBalls++;
                    break;
                case "orange":
                    points += 10;
                    orangeBalls++;
                    break;
                case "yellow":
                    points += 15;
                    yellowBalls++;
                    break;
                case "white":
                    points += 20;
                    whiteBalls++;
                    break;
                case "black":
                    points /= 2;
                    blackBalls++;
                    break;
                default:
                    otherBalls++;
                    break;
            }
        }
        System.out.printf("Total points: %d%n", points);
        System.out.printf("Red balls: %d%n", redBalls);
        System.out.printf("Orange balls: %d%n", orangeBalls);
        System.out.printf("Yellow balls: %d%n", yellowBalls);
        System.out.printf("White balls: %d%n", whiteBalls);
        System.out.printf("Other colors picked: %d%n", otherBalls);
        System.out.printf("Divides from black balls: %d%n", blackBalls);
    }
}