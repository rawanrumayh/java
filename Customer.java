


public class Customer {

int id;
private String name;
private Long phone;



public Customer( int id , String  name , Long  phone){
this .id=id;this.name=name;this.phone=phone;
}

public String toString(){
return "the customer id >>"+id + "the customer name >> \t"+ name +" the customer phone >> \t"+phone;
}



public int getId(){

return id;

}

public String getName(){
return name;

}

public String getPhone(){
return phone;

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

 return "the Driver id is >> "+id  +"the Driver name is >> " +name;
}

}//end class driver 


class CarRental {

private  int numOfCars ;


public  CarRental( int size){ //VIP or Economy
numOfCars=0;

//Array 
}

public void addCar(Car c ){
if(numOfCars<carlist.length){
carlist[numOfCars++]= c;
System.out.println("Added successfully ");}
else
Syastem.out.println("adding failed");

}


public  void  saveToFile() {

}


public  void loadFromFile(){

}


public void rentCar( String plateNo,Customer c, int numOfDay){

}

public void  returnCar( String plateNo) {

}

 
public VIP[] searchAvailableVIP(){

}
public Economy[] searchAvailableEconomy() {

}
public  Car getCar( String PN){
  //.equals(PN)
  }

}// end CarRental class 
