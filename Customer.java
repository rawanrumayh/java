import  java.io.*; 

public class Customer implements Serializable  {

int id;
private String name;
private Long phone;



public Customer( int id , String  name , Long  phone){
this.id=id;this.name=name;this.phone=phone;}

public String toString(){
return "Customer information:\n id: "+id + "\t \t name "+ name +" \n phone: "+phone+"\n";}


public int getId(){

return id;}


public String getName(){
return name;}




}//end customer class


