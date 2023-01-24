package restaurant;

import java.util.Date;
import java.util.Objects;

public class MenuItem {

    private double price;
    private String description;
    private String category;

    private boolean isNew;



    public MenuItem(double price, String description, String category, boolean isNew){
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
        //this.dateCreated = new Date();
    }

    //private Date dateCreated;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

//    public Date getDateCreated(){
//        return dateCreated;
//    }

    public String toString(){
        return category + description + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(getDescription(), menuItem.getDescription());
    }

}
