package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OldBooks {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String bookName = reader.readLine();
        int checkedBooks = 0;
        String input;
        boolean isFound = false;

        while (!"No More Books".equals(input = reader.readLine())) {
            if (bookName.equals(input)) {
                isFound = true;
                break;
            }
            checkedBooks++;
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.%n", checkedBooks);
        } else {
            System.out.printf("The book you search is not here!%nYou checked %d books.%n", checkedBooks);
        }
    }
}