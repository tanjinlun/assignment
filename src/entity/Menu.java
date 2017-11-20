package entity;

public class Menu {
  private static int nextNumber = 1;
  private String name;
  private int number;
  private String price;
  private String description;
  private String status;
  private String promo;


  public Menu(String name, String price, String description, String status, String promo) {
    this.name = name;
    this.number = nextNumber++;
    this.price = price;
    this.description = description;
    this.status = status;
    this.promo = promo;
            
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public static int getNextNumber() {
    return nextNumber;
  }

  public static void setNextNumber(int nextNumber) {
    Menu.nextNumber = nextNumber;
  }
  
      public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }
 
    
  @Override
  public String toString() {
    return String.format("No. %-10d %-20s %-20s %-20s %-20s %-20s", number, name, "RM" + price, description, status, promo);
  }
  
  
}
