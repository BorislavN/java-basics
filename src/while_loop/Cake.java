package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cake {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      int sideA=Integer.parseInt(reader.readLine());
      int sideB=Integer.parseInt(reader.readLine());
      int cake=sideA*sideB;
      String line;

      while (!"STOP".equals(line= reader.readLine())&&cake>0){
          cake-=Integer.parseInt(line);
      }
      if (cake<0){
          System.out.printf("No more cake left! You need %d pieces more.%n",Math.abs(cake));
      }else {
          System.out.printf("%d pieces are left.%n",cake);
      }
    }
}