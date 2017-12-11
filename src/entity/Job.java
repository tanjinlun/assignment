/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author User
 */
public class Job {
    private String orderID;
    private String location;
    private String status;

    public Job(String orderID, String location, String status) {
      this.orderID = orderID;
      this.location = location;
      this.status = status;
    }   
    
    public String getOrderID() {
        return orderID;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return String.format("%-10s %-30s %-20s ",orderID, location, status);
    }
}
