//import java.util.*;
import  java.io.*; 
import javax.swing.JOptionPane;
public class Economy extends Car  {

public Economy ( String plate, double price, String model, String color){
super ( plate, price, model, color);}//end cons


public String printBill(int days){
double price =0;
price = pricePerDay * days;

if (days>7)
price = price - (price*0.2);


String s= super.toString()+"\n";
s=s+"the price  :\t \t "+price+"\n";

//file

try{
String fileName=getCustomer().getName()+"_"+getCustomer().getId()+".text";
//open text file
File OUTF=new File (fileName);
FileOutputStream SF=new FileOutputStream(OUTF);
PrintWriter PW=new PrintWriter(SF);
PW.println(s);
PW.close();}

catch(IOException E){
JOptionPane.showMessageDialog(null,"somthing went wrong with saving bill");}//text

return s;
}//end printbill
}//end economy class
