public interface Payabel{

public String printBill(int days);
}//end payable

abstract class Car implements Payabel //carlist in all sub classes and here + relation between customer class
{

protected String plateNo;
protected double pricePerDay;
protected String model;
protected String color;
protected boolean available;
protected CarRental [] carlist;


public Car ( String plate, double rice, String model, String color) {
plateNo = plate; pricePerDay = rice; this.model = model; this.color = color; 
} //end const

public void setCustomer(Customer c ){

} //end setcustomer

public String toString(){ 
return "Plate number: "+plateNo+"\t price per day: "+pricePerDay+"\t model: "+model+"\t color: "+color+"\n"; 
}
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

Driver d;

public VIP ( String plate, double price, String model, String color,Driver d){
super ( plate, price, model, color); this.d=d; }//end cons
//driver

public String printBill(int days){
double price =0;
price = pricePerDay * days+(10*days);

return "VIP bill: /n the price for "+days+" days is: "+price;}//end printbill
}//end VIP class


