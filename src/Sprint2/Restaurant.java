package Sprint2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taruc
 */
public class Restaurant {
    private String place;
    private String ResName;
    
    public Restaurant(String place,String ResName){
        this.place = place;
        this.ResName = ResName;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getResName() {
        return ResName;
    }

    public void setResName(String ResName) {
        this.ResName = ResName;
    }
    
}

