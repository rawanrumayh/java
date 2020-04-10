import java.util.*;
import  java.io.*; 
import javax.swing.JOptionPane;
public class VIP extends Car {

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
String FileName= getCustomer().getName()+"_"+getCustomer().getId()+".text";
try{

//open file text

File OUTF=new File (FileName);
FileOutputStream SF=new FileOutputStream(OUTF);
PrintWriter PW=new PrintWriter(SF);
PW.println(s);
PW.close();}

catch(IOException E){
JOptionPane.showMessageDialog(null,"Error ViP file ");}//text

return s;

}//end printbill
}//end VIP class
