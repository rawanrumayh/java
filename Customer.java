import java .util.*;
import  java.io.*; 

interface Payabel{

public String printBill(int days);
}//end payable

public class Customer {

int id;
private String name;
private Long phone;



public Customer( int id , String  name , Long  phone){
this .id=id;this.name=name;this.phone=phone;}

public String toString(){
return "the customer id >>"+id + "the customer name >> \t"+ name +" the customer phone >> \t"+phone;}


public int getId(){

return id;}


public String getName(){
return name;}


public Long getPhone(){
return phone;}


//setter and getter

}//end customer class



class Driver {

private int id;
private String name;


public Driver(int id, String name){
this.id=id;
this.name=name;}


public String toString(){

 return "the Driver id is >> "+id  +"the Driver name is >> " +name;}

}//end class driver 


class CarRental {

private  int numOfCars ;
private Car [] carlist;


public  CarRental( int size){ //VIP or Economy
numOfCars=0;
carlist = new Car [size];

//Array 
}

public void addCar(Car c ){
if(numOfCars<carlist.length){
carlist[numOfCars++]= c;
System.out.println("Added successfully ");}
else
System.out.println("adding failed");

}


public  void  saveToFile() {

}


public  void loadFromFile(){

}


public void rentCar( String plateNo,Customer c, int numOfDay){ // not sure
for (int i=0; i<numOfCars; i++)
if ( carlist[i].getPlateNo().equals(plateNo) ){
carlist[i].setAvailability(false);
carlist[i].setCustomer(c);
System.out.println(carlist[i].printBill(numOfDay));}

}// end rent car

public void  returnCar( String plateNo) {
for (int i=0; i<numOfCars; i++)
if ( carlist[i].getPlateNo().equals(plateNo) ) 
carlist[i].setAvailability(true);
}


//
 
public VIP[] searchAvailableVIP(){
VIP [] AvailableVIP = new VIP [numOfCars];
int count =0;
for (int i=0; i<numOfCars; i++)
if ( carlist[i] instanceof VIP ) {
if ( carlist[i].getAvailability() )
AvailableVIP [count++] = (VIP)(carlist[i]); }

return AvailableVIP;} //end searchvip

//

public Economy[] searchAvailableEconomy() {
Economy [] AvailableEco = new Economy [numOfCars];
int count =0;

for (int i=0; i<numOfCars; i++)
if ( carlist[i] instanceof Economy ) {
if ( carlist[i].getAvailability() )
AvailableEco [count++] = (Economy)(carlist[i]); }

return AvailableEco;} // end searcheco


//

public  Car getCar( String PN){
for (int i=0; i<numOfCars; i++)
if ( carlist[i].getPlateNo().equals(PN) )
return carlist[i];
 
return null;  }

}// end CarRental class 


abstract class Car implements Payabel //carlist in all sub classes and here + relation between customer class
{

protected String plateNo;
protected double pricePerDay;
protected String model;
protected String color;
protected boolean available;
protected Customer customer;
//  *object coustmer in car class

public Car ( String plate, double rice, String model, String color) {
plateNo = plate; pricePerDay = rice; this.model = model; this.color = color; 
} //end const

public void setCustomer(Customer c ){
customer = c;
} //end setcustomer

public String toString(){ 
return "Plate number: "+plateNo+"\t price per day: "+pricePerDay+"\t model: "+model+"\t color: "+color+"\n"; }

public boolean getAvailability () { return available;}

public void setAvailability (boolean t) { available = t;}

public String getPlateNo() { return plateNo; }


//setters getters
}//end class car


class Economy extends Car {

public Economy ( String plate, double price, String model, String color){
super ( plate, price, model, color);}//end cons


public String printBill(int days){
double price =0;
price = pricePerDay * days;

if (days>7)
price = price - (price*0.2);

return "Economy bill: /n the price for "+days+" days is: "+price;}//end printbill
}//end economy class


class VIP extends Car {

Driver d;//object

public VIP ( String plate, double price, String model, String color,Driver d){
super ( plate, price, model, color); this.d=d; }//end cons
//driver

public String printBill(int days){
double price =0;
price = pricePerDay * days+(10*days);

return "VIP bill: /n the price for "+days+" days is: "+price;}//end printbill
}//end VIP class


