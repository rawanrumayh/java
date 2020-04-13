import  java.io.*; 
import javax.swing.JOptionPane;
public class CarRental {

private  int numOfCars ;
   Car [] carlist;


public  CarRental( int size){ //VIP or Economy
numOfCars=0;
carlist = new Car [size];
//loadFromFile();

//Array 
}

public void addCar(Car c ){
if( numOfCars >= carlist.length )
{
JOptionPane.showMessageDialog(null ,"your list is full, you can't add another car");
return;
}
// search  
for( int i =0 ; i < numOfCars ; i++ )
if( carlist[i].getPlateNo().equals(c.getPlateNo()))
{
JOptionPane.showMessageDialog(null ,"sorry we cant add this car , the plate number is already Exist");
return ; } 

/*carlist[numOfCars++] = c ; 
String Type = c.getClass().getSimpleName() ;
JOptionPane.showMessageDialog(null ,"add new " + Type + " car to system successfully");*/

if ( c instanceof Economy){
carlist[numOfCars++] = (Economy)c ;
JOptionPane.showMessageDialog(null ,"an Economy Car added to the system successfully");}

else if ( c instanceof VIP){
carlist[numOfCars++] = (VIP)c ;
JOptionPane.showMessageDialog(null ,"an VIP Car added to the system successfully");} 

}


public  void  saveToFile() {
try{
File out =new  File ("cars.dat");
FileOutputStream  f=new FileOutputStream(out);
ObjectOutputStream os = new ObjectOutputStream(f);
os.writeObject(carlist);

os.close();
JOptionPane.showMessageDialog(null , "Thank you for using <<CAR RENTAL SYSTEM >>, All changes are saved. ");  //show


/*ObjectOutputStream oss=new ObjectOutputStream(f);*/} catch(IOException e){JOptionPane.showMessageDialog(null , "Error in saving this file ");  }


//try



}


public void loadFromFile(){

try{

File F = new File("cars.dat") ;
FileInputStream fi = new FileInputStream(F);
ObjectInputStream file= new ObjectInputStream( fi);

if ( F.length() ==0) return;

try{  
while( true ){

try{

carlist = (Car[]) file.readObject();

} catch(ClassNotFoundException e1 ){
JOptionPane.showMessageDialog(null , e1.getMessage());}}

} catch(EOFException e)
{file.close();}

} catch(FileNotFoundException e)
{return;}

 catch(IOException ex  ){
JOptionPane.showMessageDialog(null , "IO "+ex.getMessage());  }

}// end load 



public void rentCar( String plateNo,Customer c, int numOfDay){

Car car=this.getCar(plateNo);
if (car == null)
JOptionPane.showMessageDialog(null,"plateNo is not found");

else if(car.available){ 
car.setCustomer(c);
String str=car.printBill(numOfDay);
car.setAvailability(false);
JOptionPane.showMessageDialog(null,"Dear "+c.getName()+" the car is rented successfully \n "+str);
}//if2

else if (!car.available){
JOptionPane.showMessageDialog(null," the car is not Available");
}//else

}//end RentCar


public void  returnCar( String plateNo) {
Car car= getCar(plateNo);

if(car==null){
JOptionPane.showMessageDialog(null," plateNo is not Found");
}//if1

else if(!car.available){
car.setCustomer(null);
car.setAvailability(true);
JOptionPane.showMessageDialog(null," Car is returned successfuly");
}//if2

else if (car.available)
JOptionPane.showMessageDialog(null,"this Car is not rented");
}


//
 
public VIP[] searchAvailableVIP(){
JOptionPane.showMessageDialog(null,carlist);

VIP [] AvailableVIP = new VIP [numOfCars];
int count =0;

for (int i=0; i<numOfCars; i++)
if ( carlist[i] instanceof VIP && carlist[i].isAvailable() ) 
AvailableVIP [count++] = ((VIP)(carlist[i])); 

return AvailableVIP;} //end searchvip

//

public Economy[] searchAvailableEconomy() {
Economy [] AvailableEco = new Economy [numOfCars];
int count =0;
for (int i=0; i<numOfCars; i++)
if ( carlist[i] instanceof Economy ) {
if ( carlist[i].isAvailable())
AvailableEco [count++] = (Economy)(carlist[i]); }

return AvailableEco;} // end searcheco


//

public  Car getCar( String PN){
JOptionPane.showMessageDialog(null,carlist);

for (int i=0; i<numOfCars; i++)
if ( carlist[i].getPlateNo().equals(PN) )
return carlist[i];
else continue;
return null;  }

}// end CarRental class 
