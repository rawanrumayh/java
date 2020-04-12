import java.util.*;
import  java.io.*; 
import javax.swing.JOptionPane;
public class CarRental {

private  int numOfCars ;
private Car [] carlist;


public  CarRental( int size){ //VIP or Economy
numOfCars=0;
carlist = new Car [size];

//Array 
}

public void addCar(Car c ){
if( numOfCars >= carlist.length )
{
JOptionPane.showMessageDialog(null ,"your list is full, you can't add another car");
return;
}
// sarch  id first
for( int i =0 ; i < numOfCars ; i++ )
if( carlist[i].getPlateNo().equals(c.getPlateNo()))
{
JOptionPane.showMessageDialog(null ,"sorry  couldn't add this car , the plate number is already Exist");
return ; 
}
String type = c.getClass().getName() ;
if ( c instanceof Economy){
carlist[numOfCars++] = (Economy)c ;}

if ( c instanceof VIP){
carlist[numOfCars++] = (VIP)c ;}

JOptionPane.showMessageDialog(null ,"an "+ type+ " Car added to the system successfully");
}


public  void  saveToFile() {
try{
File out =new  File ("cars.dat");
FileOutputStream  f=new FileOutputStream(out);
ObjectOutputStream os = new ObjectOutputStream(f);

for( int i = 0 ;i < this.numOfCars ; i++ )
os.writeObject(carlist[i]);

os.close();

JOptionPane.showMessageDialog(null , "Thank you for using <<CAR RENTAL SYSTEM >>, All changes is saved. ");  //show


ObjectOutputStream oss=new ObjectOutputStream(f);} catch(IOException e){JOptionPane.showMessageDialog(null , "Error in saving this file ");  }


//try



}


public  void loadFromFile(){
ObjectInputStream file = null;
try{
File F = new File("cars.dat") ;
if (F.length()==0) return; 
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
 file.close(); } 
catch(IOException ex ){ } 
}// end load 



public void rentCar( String plateNo,Customer c, int numOfDay){
Car car=this.getCar(plateNo);

if (car == null)
JOptionPane.showMessageDialog(null,"plateNo is not found");

else if(car.available){ 
car.setCustomer(c);
String str=car.printBill(numOfDay);
car.setAvailability(false);
JOptionPane.showMessageDialog(null," car is rented successfully");
JOptionPane.showMessageDialog(null,str);
}//if2

else if (!car.available){
JOptionPane.showMessageDialog(null," car is not Available");
}//else

}//end RentCar


public void  returnCar( String plateNo) {
Car car=this.getCar(plateNo);
if(car==null){
JOptionPane.showMessageDialog(null," plateNo is not Found");
return;}//if1

if(car.available==false){
car.setCustomer(null);
car.setAvailability(true);
JOptionPane.showMessageDialog(null," Car is returned successfuly");
return;}//if2
else
JOptionPane.showMessageDialog(null,"this Car is Available");
return;
}


//
 
public VIP[] searchAvailableVIP(){
VIP [] AvailableVIP = new VIP [numOfCars];
int count =0;
for (int i=0; i<numOfCars; i++)
if ( carlist[i] instanceof VIP ) {
if ( carlist[i].getAvailability()==true )
AvailableVIP [count++] = (VIP)(carlist[i]); }
if(count==0)
return null;
return AvailableVIP;} //end searchvip

//

public Economy[] searchAvailableEconomy() {
Economy [] AvailableEco = new Economy [numOfCars];
int count =0;
for (int i=0; i<numOfCars; i++)
if ( carlist[i] instanceof Economy ) {
if ( carlist[i].getAvailability() ==true)
AvailableEco [count++] = (Economy)(carlist[i]); }
if(count==0)
return null;
return AvailableEco;} // end searcheco


//

public  Car getCar( String PN){
for (int i=0; i<numOfCars; i++)
if ( carlist[i].getPlateNo().equals(PN) )
return carlist[i];
else continue;
 
return null;  }

}// end CarRental class 
