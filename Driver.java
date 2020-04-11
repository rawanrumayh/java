import java.util.*;
import  java.io.*; 
public class Driver implements Serializable {

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

 return "Driver information \n id: "+id  +"\t \t name: " +name+"\n";}

}//end class driver 