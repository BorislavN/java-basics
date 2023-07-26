package first_steps_in_coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FoodDelivery {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double chickenMenu = 10.35;
        double fishMenu = 12.40;
        double vegetarianMenu = 8.15;
        double deliveryPrice = 2.50;

        double chickenMenusTotal = Integer.parseInt(reader.readLine()) * chickenMenu;
        double fishMenusTotal = Integer.parseInt(reader.readLine()) * fishMenu;
        double vegetarianMenusTotal = Integer.parseInt(reader.readLine()) * vegetarianMenu;

        double mainTotal = chickenMenusTotal + fishMenusTotal + vegetarianMenusTotal;
        double desert = mainTotal*0.20;

        System.out.println(mainTotal+desert+deliveryPrice);
    }
}