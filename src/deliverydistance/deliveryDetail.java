/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverydistance;

/**
 *
 * @author tan
 */
public class deliveryDetail {
    private String deliveryCode;
    private String deliveryPlace;
    private String contactNo;
    private String address;
    private int distance;
    
    public deliveryDetail(String deliveryCode, String deliveryPlace, String contactNo, String address,int distance){
        this.deliveryCode = deliveryCode;
        this.deliveryPlace = deliveryPlace;
        this.contactNo = contactNo;
        this.address = address;
        this.distance = distance;
       
    }

    public String getDeliveryCode() {
        return deliveryCode;
    }

    public void setDeliveryCode(String deliveryCode) {
        this.deliveryCode = deliveryCode;
    }

    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    public void setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    
    
}
