import java.util.*;
import  java.io.*; 
import javax.swing.JOptionPane;



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


class Driver implements Serializable {

private int id;
private String name;


public Driver(int id, String name){
this.id=id;
this.name=name;}


public int getId(){
return id;}

public void setId(){
this.id=id;}
public String getName(){
return name;
}
public void setName(){
this.name=name;  }
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
try{
File out =new  File ("cars.dat");
FileOutputStream  f=new FileOutputStream(out);
ObjectOutputStream os=new ObjectOutputStream(f);} catch(IOException e){System.out.println(e);}

}


public  void loadFromFile(){
ObjectInputStream file = null;
try{
File F = new File("cars.dat") ; 
FileInputStream fi = new FileInputStream(F);
file= new ObjectInputStream( fi);

while( true )
{
Car c = (Car) file.readObject() ; //object
//addCar( c ) ; 
if( numOfCars >= carlist.length )
 break;  
carlist[numOfCars++] = c ; 
}

}
catch(EOFException e)
{

}
catch(ClassNotFoundException e1 )
{
JOptionPane.showMessageDialog(null , "Error  Reading car from file ");  

}
catch(IOException ex  )
{
JOptionPane.showMessageDialog(null , "Error file in carRental");  
}

try{  if( file!= null )
 file.close();//clse } 
catch(IOException ex ){ } 
}// end load 

}


public void rentCar( String plateNo,Customer c, int numOfDay){
Car car=this.getCar(plateNo);
if(car==null){
JoptionPane.showMessageDialog(null,"plateNo not found");
return;
}//if 1

if(car.isAvailable()==true){
car.printBill(numOfDay);
car.setCustomer(c);
car.setAvailable(false);
JoptionPane.showMessageDialog(false,"rent car successfully");
String str=car.printBill(numOfDay);
JoptionPane.showMessageDialog(null,str);

return;}//if2

else{
JoptionPane.showMessageDialog(null,"this car not Availeble");
return;}//else
}//end RentCar


public void  returnCar( String plateNo) {
Car car=this.getCar(plateNo);
if(car==null){
JoptionPane.showMessageDialog(null,"this plateNo not Found");
return;}//if1

if(car.isAvailable()==false){
car.setCustomer(null);
car.setAvailable(true);
JoptionPane.showMessageDialog(null,"return Car is successfuly");
return;}//if2
else
JoptionPane.showMessageDialog(null,"this Car Available");
return;
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


abstract class Car implements Payabel,Serializable //carlist in all sub classes and here + relation between customer class
{

protected String plateNo;
protected double pricePerDay;
protected String model;
protected String color;
protected boolean available;
protected Customer cr;
//  *object coustmer in car class

public Car ( String plate, double rice, String model, String color) {
plateNo = plate; pricePerDay = rice; this.model = model; this.color = color; 
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

class Economy extends Car {

public Economy ( String plate, double price, String model, String color){
super ( plate, price, model, color);}//end cons


public String printBill(int days){
double price =0;
price = super.pricePerDay * days;

if (days>7)
price = price - (price*0.2);


String s="Economy bill: \n"+super.toString()+"\n";
s=s+"the price  :\n"+price+"\n";

//file
String fileName=getCustomer.getName()+"_"+getCustomer.getId()+".text";
try{
//open text file
File OUTF=new File (fileName);
FileOutputStream SF=new FileOutputStream(OUTF);
PrintWriter PW=new PrintWriter(SF);
PW.println(s);
PW.close();}

catch(IOException E){
JOptionPane.showMessageDialog(null,"Error economy file ");}//text

return s;
}//end printbill
}//end economy class


class VIP extends Car {

Driver d;//object

public VIP ( String plate, double price, String model, String color,Driver d){
super ( plate, price, model, color); this.d=d; }//end cons
//driver

public String printBill(int days){
double price =0;
price =super. pricePerDay * days+(10*days);
String s="VIP bill: \n"+super.toString()+"\n";
s=s+"Driver :"+d.toString()+"\n";
s=s+"the price:"+price+"\n";
String FileName= getCustomer.getName()+"_"+getCustomer.getId()+".text";
try{

//open file text

File OUTF=new File (fileName);
FileOutputStream SF=new FileOutputStream(OUTF);
PrintWriter PW=new PrintWriter(SF);
PW.println(s);
PW.close();}

catch(IOException E){
JOptionPane.showMessageDialog(null,"Error ViP file ");}//text

return s;

}//end printbill
}//end VIP class


