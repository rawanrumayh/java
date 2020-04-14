import  java.io.*; 

interface Payabel{

public String printBill(int days);
}//end payable

public abstract class Car implements Payabel, Serializable 
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

    
     public Customer getCustomer() {
        return cr;
    }//

    public void setCustomer(Customer cr) {
        this.cr = cr;
    }//


    public boolean isAvailable() {
        return available;
    }//

    public void setAvailability(boolean available) {
        this.available = available;
    }//
    
       

   
   
public String toString(){ 
String St= "Car information:\n Type: "+this.getClass().getName()+"\t \t Plate number: "+plateNo+"\n price per day: "+pricePerDay+"\t \t model: "+model+"\n  color: "+color+"\t \t available : "+available +"\n";  
        
        return St ; }

}//end class car
