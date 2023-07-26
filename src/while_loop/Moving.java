package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Moving {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int width = Integer.parseInt(reader.readLine());
        int length = Integer.parseInt(reader.readLine());
        int height = Integer.parseInt(reader.readLine());

        int freeSpace = width * length * height;
        String line;

        while (!"Done".equals(line = reader.readLine()) && freeSpace > 0) {
            freeSpace -= Integer.parseInt(line);
        }
        if (freeSpace < 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.%n", Math.abs(freeSpace));
        } else {
            System.out.printf("%d Cubic meters left.%n", freeSpace);
        }
    }
}