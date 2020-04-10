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
return "Plate number: "+plateNo+"\t price per day: "+pricePerDay+"\t model: "+model+"\t color: "+color+"\t available : "+available +"\t Customer :"+cr.toString()+ " \n"; }

public boolean getAvailability () { return available;}

public void setAvailability (boolean t) { available = t;}

public String getPlateNo() { return plateNo; }


//setters getters
}//end class car
