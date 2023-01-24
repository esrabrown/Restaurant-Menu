package restaurant;


import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date lastUpdated;

    private ArrayList<MenuItem> items;


    public Menu(ArrayList<MenuItem> items, Date lastUpdated) {
        this.items = items;
        this.lastUpdated = lastUpdated;
    }


    public ArrayList<MenuItem> addItem(MenuItem item) {
        this.items.add(item);
        System.out.println("Added: " + this.items);
        return this.items;
    }

    public ArrayList<MenuItem> removeItem(MenuItem item) {
        int toBeRemoved = -1;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                toBeRemoved = i;
            }
        }
        this.items.remove(toBeRemoved);
        System.out.println("Removed: " + this.items);
        return this.items;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void printItem(MenuItem item) {
        System.out.println(item.getDescription());
    }

    public void printMenu() {
        System.out.println("");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("Price: " + items.get(i).getPrice());
            System.out.println("Description:" + items.get(i).getDescription());
            System.out.println("Category: " + items.get(i).getCategory());
           // System.out.println(items.get(i).getPrice());
           // System.out.println(items.get(i).getDescription());
            //System.out.println(items.get(i).getCategory());
        }
    }
}

//   TODO: A way to add and remove menu items from the menu.
//
//   TODO: A way to tell if a menu item is new.
//
//   TODO: A way to tell when the menu was last updated.
//
//   TODO: A way to print out both a single menu item as well as the entire menu.
//
//   TODO: A way to determine whether or not two menu items are equal.

