import  java.io.*; 
public class Driver implements Serializable {

private int id;
private String name;


public Driver(int id, String name){
this.id=id;
this.name=name;}


public int getId(){
return id;}


public String getName(){
return name;
}


public String toString(){

 return "\n Driver information \n id: "+id  +"\t \t name: " +name+"\n";}

}//end class driver 