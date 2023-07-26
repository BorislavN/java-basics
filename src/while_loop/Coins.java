package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coins {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double amount = Double.parseDouble(reader.readLine())*100;
        int coins = 0;

        int amountAsInteger = Integer.parseInt(String.format("%.0f",amount));

//        if (amountAsInteger/200>=1){
//            coins+=amountAsInteger/200;
//            amountAsInteger%=200;
//        }
//        if (amountAsInteger/100>=1){
//            coins+=amountAsInteger/100;
//            amountAsInteger%=100;
//        }
//        if (amountAsInteger/50>=1){
//            coins+=amountAsInteger/50;
//            amountAsInteger%=50;
//        }
//        if (amountAsInteger/20>=1){
//            coins+=amountAsInteger/20;
//            amountAsInteger%=20;
//        }
//        if (amountAsInteger/10>=1){
//            coins+=amountAsInteger/10;
//            amountAsInteger%=10;
//        }
//        if (amountAsInteger/5>=1){
//            coins+=amountAsInteger/5;
//            amountAsInteger%=5;
//        }
//        if (amountAsInteger/2>=1){
//            coins+=amountAsInteger/2;
//            amountAsInteger%=2;
//        }
//        if (amountAsInteger >=1){
//            coins+= amountAsInteger;
//        }
        while (amountAsInteger>0){
            if (amountAsInteger>=200){
                amountAsInteger-=200;
                coins++;
                continue;
            }
            if (amountAsInteger>=100){
                amountAsInteger-=100;
                coins++;
                continue;
            }
            if (amountAsInteger>=50){
                amountAsInteger-=50;
                coins++;
                continue;
            }
            if (amountAsInteger>=20){
                amountAsInteger-=20;
                coins++;
                continue;
            }
            if (amountAsInteger>=10){
                amountAsInteger-=10;
                coins++;
                continue;
            }
            if (amountAsInteger>=5){
                amountAsInteger-=5;
                coins++;
                continue;
            }
            if (amountAsInteger>=2){
                amountAsInteger-=2;
                coins++;
                continue;
            }
            if (amountAsInteger>=1){
                coins++;
                amountAsInteger-=1;
            }
        }
        System.out.println(coins);
    }
}