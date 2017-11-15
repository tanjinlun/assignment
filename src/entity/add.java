/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author tzeletan
 */
public class add {
  private static int nextNumber = 1;
  private String Name;
  private int number;
  private String Ic;
  private String Address;
  private String BDate;

  public add(String Name, String Ic, String Address, String BDate) {
    this.Name = Name;
    this.number = nextNumber++;
    this.Ic = Ic;
    this.Address = Address;
    this.BDate = BDate;
    
            
  }
    public static int getNextNumber() {
        return nextNumber;
    }

    public static void setNextNumber(int nextNumber) {
        add.nextNumber = nextNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getIc() {
        return Ic;
    }

    public void setIc(String Ic) {
        this.Ic = Ic;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getBDate() {
        return BDate;
    }

    public void setBDate(String BDate) {
        this.BDate = BDate;
    }
   @Override
  public String toString() {
    return String.format("No. %-10d %-20s %-20s %-20s %-20s ", number, Name, Ic, Address, BDate);
  }
}
