import  java.io.*; 
import javax.swing.JOptionPane;
public class VIP extends Car {

Driver d;//object

public VIP ( String plate, double price, String model, String color,Driver d){
super ( plate, price, model, color); this.d=d; }//end cons
//driver

public String printBill(int days){
double price =0;
price = pricePerDay * days+(100*days);

String s= cr.toString()+"\n"+super.toString();
s=s+d.toString()+"\n";
s=s+"the price:"+price+"\n";

try{
String FileName= cr.getName()+"_"+cr.getId()+".text";
//open file text

File OUTF=new File (FileName);
FileOutputStream SF=new FileOutputStream(OUTF);
PrintWriter PW=new PrintWriter(SF);
PW.println(s);
PW.close();}

catch(IOException E){
JOptionPane.showMessageDialog(null,"somthing went wrong with saving bill");}//text

return s;

}//end printbill


public String toString () { return super.toString()+"\n"+d.toString()+"\n";}
}//end VIP class
