public class Customer {

int id;
private String name;
private Long phone;



public Customer( int id , String name ,/* String,*/ Long phone){
this.id =id; this.name= name; this.phone = phone;}

public String toString(){
return "Customer id: "+id+"\t name: "+name+"\t phone number "+phone+"\n";
}

//setter and getter

}//end customer class



class Driver {

private int id;
private String name;
public Driver(int id, String name){
 this.id=id;
    this.name=name;
}


public String toString(){

 return "the id is >> "+id  +"the name is >> " +name;
}

}//end class driver 


class CarRental {

protected int numOfCars;


public CarRental( int size){ 

}

public void addCar(Car c ){

}


public void saveToFile() {

}


public loadFromFile(){

}


public void rentCar( String plateNo,Customer c, int numOfDay){

}

public void  returnCar( String plateNo) {

}

 
public VIP[] searchAvailableVIP(){

}
public Economy[] searchAvailableEconomy() {

}
public  Car getCar(PN: String){

}

}// end CarRental class 
