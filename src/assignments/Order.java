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
    private String schedule;
    private String section;
    private String meal;
    private String price;
    private String destination;

    public Order(String schedule, String section, String set, String price, String destination) {
        this.schedule = schedule;
        this.section = section;
        this.meal = meal;
        this.price = price;
        this.destination = destination;
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
    /**
     * @param args the command line arguments
     */
  
    
}
