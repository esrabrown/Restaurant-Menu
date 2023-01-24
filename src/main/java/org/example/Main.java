package org.example;

import restaurant.Menu;
import restaurant.MenuItem;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {



        ArrayList<MenuItem> items = new ArrayList<>();
        Date today = Calendar.getInstance().getTime();




        //Menu menu = new Menu(items, lastUpdated);
        MenuItem item1 = new MenuItem(9.12, " Cheesecake " , " Dessert" , false);
        MenuItem item2 = new MenuItem(3,"Chicken" , "Main Course" , true );
        Menu dessertMenu = new Menu(items, today);
        dessertMenu.addItem(item1);
        dessertMenu.addItem(item2);
        dessertMenu.printMenu();
        dessertMenu.printItem(item1);
        dessertMenu.removeItem(item2);
        //System.out.println("Removed: " + dessertMenu.removeItem(item2));
    }
}