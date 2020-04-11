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
public Customer getCustomer(){
return cr;}
public void setCustomer(Customer c ){
this.cr = c;
} //end setcustomer

public String toString(){ 
return "Car information:\n Plate number: "+plateNo+"\t \t price per day: "+pricePerDay+"\t \t model: "+model+"\t \t color: "+color+"\t \t available : "+available +"\n"+cr.toString(); }

public boolean getAvailability () { return available;}

public void setAvailability (boolean t) { available = t;}

public String getPlateNo() { return plateNo; }


//setters getters
}//end class car
