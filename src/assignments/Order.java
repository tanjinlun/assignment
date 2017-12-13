
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

/**
 *
 * @author Asus
 */
public class Order {
    private String orderID;
    private String schedule;
    private String section;
    private String restaurant;
    private String meal;
    private String price;
    private String destination;
    private String deliveryman;

    public Order(String orderID, String schedule, String section,String restaurant, String meal, String price,String destination, String deliveryman) {
        this.orderID = orderID;
        this.schedule = schedule;
        this.section = section;
        this.restaurant=restaurant;
        this.meal = meal;
        this.price = price;
        this.destination = destination;
        this.deliveryman = deliveryman;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getmeal() {
        return meal;
    }

    public void setmeal(String meal) {
        this.meal = meal;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeliveryman() {
        return deliveryman;
    }

    public void setDeliveryman(String deliveryman) {
        this.deliveryman = deliveryman;
    }

    @Override
    public String toString() {
        return  orderID + "  " + schedule + "  " + section + "  " + restaurant+"  "+ meal + "  " + price  + "  " + destination + deliveryman;
    }
    
    /**
     * @param args the command line arguments
     */
  
    
}
