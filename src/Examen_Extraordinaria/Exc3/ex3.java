package Examen_Extraordinaria.Exc3;

import java.util.Random;

public class ex3 {

    public static Menu[] menus = new Menu[1000];

    public static void main(String[] args){

        Random rand = new Random();
        DIES[] diesValues = DIES.values();

        for (int i = 0; i < menus.length; i++) {
            DIES randomDay = diesValues[rand.nextInt(diesValues.length)];
            menus[i] = new Menu(randomDay);
        }


        System.out.println("Unsorted");

        for (Menu menu : menus) {
            System.out.println(menu);
        }

        System.out.println("Sorted");

        Menu[] sorted = sort(menus);

        for (Menu menu : sorted) {
            System.out.println(menu);
        }

    }

    public static Menu[] sort(Menu[] menu){

        int n = menu.length;
        for (int i = 0; i < n-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (menu[j].getValue() > menu[j+1].getValue()) {
                    Menu temp = menu[j];
                    menu[j] = menu[j+1];
                    menu[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }

        return menu;

    }





}
