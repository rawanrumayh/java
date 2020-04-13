import java.util.*;
import  java.io.*; 
import java.io.Serializable;

public class Customer implements Serializable  {

int id;
private String name;
private Long phone;



public Customer( int id , String  name , Long  phone){
this .id=id;this.name=name;this.phone=phone;}

public String toString(){
return "\n Customer information:\t \t id: "+id + "\t \t name "+ name +" \t \t phone: "+phone+"\n";}


public int getId(){

return id;}


public String getName(){
return name;}


public Long getPhone(){
return phone;}

 public void setPhone(long phone) {
        this.phone = phone;
}
  public void setName(String name) {
        this.name = name;
}

public void setId(int id) {
        this.id = id;
}

//setter and getter

}//end customer class


