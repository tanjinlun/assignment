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
public class DeliveryMan {
    private String staffID;
    private String status;
    private String jobAssigned;
    
  public DeliveryMan(String staffID, String status, String jobAssigned) {
    this.staffID = staffID;
    this.status = status;
    this.jobAssigned = jobAssigned;
  }
    
    public String getStaffID() {
        return staffID;
    }

    public String getStatus() {
        return status;
    }

    public String getJobAssigned() {
        return jobAssigned;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setJobAssigned(String jobAssigned) {
        this.jobAssigned = jobAssigned;
    }
    
    @Override
    public String toString() {
        return String.format("%-10s %-30s %-20s ",staffID, status, jobAssigned);
    }
}
