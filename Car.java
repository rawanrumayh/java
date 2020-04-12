import java.util.*;
import  java.io.*; 

interface Payabel{

public String printBill(int days);
}//end payable

public abstract class Car implements Payabel,Serializable 
{

protected String plateNo;
protected double pricePerDay;
protected String model;
protected String color;
protected boolean available;
protected Customer cr;

public Car ( String plate, double price, String model, String color) {
plateNo = plate; pricePerDay = price; this.model = model; this.color = color; 
this.available=true;
} //end const
public String getPlateNo() {
        return plateNo;
    }//

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }//

    public double getPricePerDay() {
        return pricePerDay;
    }//

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }//

    public String getModel() {
        return model;
    }//
    public void setModel(String model) {
        this.model = model;
    }//

    public String getColor() {
        return color;
    }//

    public void setColor(String color) {
        this.color = color;
    }//
    
     public Customer getCustomer() {
        return cr;
    }//

    public void setCustomer(Customer cr) {
        this.cr = cr;
    }//


    public boolean isAvailable() {
        return available;
    }//

    public void setAvailable(boolean available) {
        this.available = available;
    }//
    
        public boolean getAvailability() {
        return available;
    }//


   
   
public String toString(){ 
String St= "Car information:\n Plate number: "+plateNo+"\t \t price per day: "+pricePerDay+"\t \t model: "+model+"\t \t color: "+color+"\t \t available : "+available +"\n"; 
 if( cr != null )//coustmer
             St = St +  " Customer : " + cr.toString() + "\n";
        
        return St ; }

//setters getters
}//end class car
