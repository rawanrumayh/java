import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test{

public static void main (String[]args) {
GUI frame = new GUI ();

frame.setVisible(true);

}}//end Test


class GUI extends JFrame implements ActionListener {
private CarRental list;
private JTextField addCarPlateNo; private JTextField addCarPrice;        private JTextField addCarmodel; 
private JTextField addCarcolor;   private JRadioButton EconomySelection; private JRadioButton VIPSelection;  
private JTextField DriverID;      private JTextField DriverName; 
private JTextField rentCarPlateNo;private  JTextField RentCarNumOfDays;  private JTextField CustomerID;
private JTextField CustomerName;  private JTextField CustomerPhone;      private JTextField ReturnCarPlateNo; 
private JPanel driverPanel;       private JTextArea bill;


public GUI (){
list = new CarRental (100);

setSize(1000,800);
setTitle("Rental System");



JButton AddCar, ShowAllEco, ShowAllVIP, Rent;

Container contentPane = getContentPane(); contentPane.setLayout(null); 


JLabel image = new JLabel (new ImageIcon ("com.png"));
image.setSize(450,700);
image.setLocation(480,270); 
contentPane.add(image);

JLabel title = new JLabel ("Car Rental System"); title.setSize(280,60); title.setLocation(20,0); 
title.setFont(new Font ("Jokerman", Font.PLAIN, 30));  title.setForeground(Color.gray);
contentPane.add(title); 


// add new car panel

JPanel addPanel = new JPanel();
addPanel.setSize(450,300); addPanel.setLocation(20,50); addPanel.setBorder(BorderFactory.createTitledBorder("Add new car")); addPanel.setLayout(null);
contentPane.add(addPanel);


JLabel imageadd = new JLabel (new ImageIcon ("try.png"));
imageadd.setSize(180,160);
imageadd.setLocation(260,5); 
addPanel.add(imageadd);

AddCar = new JButton("Add new Car"); AddCar.setBounds(115,270,130,20);
addPanel.add(AddCar); AddCar.addActionListener(this);

JLabel text = new JLabel ("plateNo : ");
text.setSize(56,14); text.setLocation(10,30); addPanel.add(text); 

addCarPlateNo = new JTextField(); addCarPlateNo.setSize(140,20); addCarPlateNo.setLocation(100,30); 
addPanel.add(addCarPlateNo); addCarPlateNo.addActionListener(this);

text = new JLabel ("pricePerDay : ");
text.setSize(80,50); text.setLocation(10,50); addPanel.add(text); 


addCarPrice = new JTextField();
addCarPrice.setSize(140,20); addCarPrice.setLocation(100,65);
addPanel.add(addCarPrice); addCarPrice.addActionListener(this);

text = new JLabel ("model : ");
text.setSize(80,50); text.setLocation(10,90); addPanel.add(text); 


addCarmodel = new JTextField();
addCarmodel.setSize(140,20); addCarmodel.setLocation(100,105);
addPanel.add(addCarmodel); addCarmodel.addActionListener(this);

text = new JLabel ("color :");
text.setSize(80,50); text.setLocation(10,130); addPanel.add(text); 


addCarcolor = new JTextField();
addCarcolor.setSize(140,20); addCarcolor.setLocation(100,145);
addPanel.add(addCarcolor); addCarcolor.addActionListener(this);

ButtonGroup group = new ButtonGroup();
 EconomySelection = new JRadioButton ("Economy"); EconomySelection.setBounds(20,190,79,16); addPanel.add(EconomySelection); EconomySelection.addActionListener(this);
 VIPSelection     = new JRadioButton ("VIP");     VIPSelection.setBounds(20,210,44,12);     addPanel.add(VIPSelection);     VIPSelection.addActionListener(this);
group.add(EconomySelection); group.add(VIPSelection);
// driver panel

driverPanel = new JPanel(); 
driverPanel.setSize(202,85); driverPanel.setLocation(130,170); 
driverPanel.setBorder(BorderFactory.createTitledBorder("driver")); 
driverPanel.setLayout(null); addPanel.add(driverPanel);

text = new JLabel ("id :"); 
text.setSize(20,12); text.setLocation(10,30); driverPanel.add(text);
DriverID = new JTextField (); DriverID.setSize(140,20); DriverID.setLocation(55,30); driverPanel.add(DriverID); DriverID.addActionListener(this);

text = new JLabel ("name :"); 
text.setSize(40,12); text.setLocation(10,53); driverPanel.add(text);
DriverName = new JTextField (); DriverName.setSize(140,20); DriverName.setLocation(55,53); driverPanel.add(DriverName); DriverName.addActionListener(this);




// show information panel

JPanel ShowInfo = new JPanel ();
ShowInfo.setSize(450,300); ShowInfo.setLocation(20,380); 
ShowInfo.setBorder(BorderFactory.createTitledBorder("Show Information")); 
ShowInfo.setLayout(null); contentPane.add(ShowInfo);


ShowAllEco = new JButton("Show all available Economy cars"); ShowAllEco.setBounds(10,25,218,25); ShowAllEco.addActionListener(this);
ShowAllVIP = new JButton("Show all available VIP cars"); ShowAllVIP.setBounds(240,25,200,25); ShowAllVIP.addActionListener(this);
ShowInfo.add(ShowAllEco); ShowInfo.add(ShowAllVIP); 


bill = new JTextArea (); bill.setSize(420,200); bill.setLocation(15,70); bill.setEditable(false); ShowInfo.add(bill); 


// rent car panel

JPanel RentCar = new JPanel ();
RentCar.setSize(400,300); RentCar.setLocation(500,50); 
RentCar.setBorder(BorderFactory.createTitledBorder("Rent Car")); 
RentCar.setLayout(null); contentPane.add(RentCar);

JLabel imagerent = new JLabel (new ImageIcon ("key.png"));
imagerent.setSize(140,90);
imagerent.setLocation(250,20); 
RentCar.add(imagerent);

JLabel text1 = new JLabel ("plateNo :");
text1.setSize(56,14); text1.setLocation(15,30); RentCar.add(text1);
rentCarPlateNo = new JTextField(); rentCarPlateNo.setSize(132,20); rentCarPlateNo.setLocation(100,30); RentCar.add(rentCarPlateNo); rentCarPlateNo.addActionListener(this);

text = new JLabel ("No. of days :");
text.setSize(70,14); text.setLocation(15,60); RentCar.add(text);
RentCarNumOfDays = new JTextField(); RentCarNumOfDays.setSize(132,20); RentCarNumOfDays.setLocation(100,60); RentCar.add(RentCarNumOfDays);RentCarNumOfDays.addActionListener(this);

// customer information panel

JPanel CustomerInfo = new JPanel ();
CustomerInfo.setSize(300,150); CustomerInfo.setLocation(20,100); 
CustomerInfo.setBorder(BorderFactory.createTitledBorder("Customer Information")); 
CustomerInfo.setLayout(null); RentCar.add(CustomerInfo);

text  = new JLabel ("id :");
text.setSize(56,14); text.setLocation(15,30); CustomerInfo.add(text);
CustomerID = new JTextField(); CustomerID.setSize(132,20); CustomerID.setLocation(80,30); CustomerInfo.add(CustomerID); CustomerID.addActionListener(this);

text  = new JLabel ("name :");
text.setSize(56,14); text.setLocation(15,60); CustomerInfo.add(text);
CustomerName = new JTextField(); CustomerName.setSize(132,20); CustomerName.setLocation(80,60); CustomerInfo.add(CustomerName); CustomerName.addActionListener(this);

text  = new JLabel ("phone :");
text.setSize(56,14); text.setLocation(15,90); CustomerInfo.add(text);
CustomerPhone = new JTextField(); CustomerPhone.setSize(132,20); CustomerPhone.setLocation(80,90); CustomerInfo.add(CustomerPhone); CustomerPhone.addActionListener(this);

Rent  = new JButton("Rent Car"); Rent.setBounds(120,270,100,20);
RentCar.add(Rent);  Rent.addActionListener(this);


//Return car panel

JPanel ReturnCar = new JPanel ();
ReturnCar.setSize(400,130); ReturnCar.setLocation(500,410); 
ReturnCar.setBorder(BorderFactory.createTitledBorder("Renturn Car")); 
ReturnCar.setLayout(null); contentPane.add(ReturnCar);

text  = new JLabel ("plateNo :");
text.setSize(56,14); text.setLocation(25,40); ReturnCar.add(text);
ReturnCarPlateNo = new JTextField(); ReturnCarPlateNo.setSize(132,20); ReturnCarPlateNo.setLocation(95,40); ReturnCar.add(ReturnCarPlateNo); ReturnCarPlateNo.addActionListener(this);

JButton Return = new JButton("Return Car"); Return.setBounds(120,90,100,20); ReturnCar.add(Return); Return.addActionListener(this);


setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
addWindowListener(new java.awt.event.WindowAdapter() {
public void windowClosing(java.awt.event.WindowEvent e) {
int PromptResult = JOptionPane.showConfirmDialog(null,"Do you want to save your changes?","before closing",JOptionPane.YES_NO_CANCEL_OPTION);
if(PromptResult==JOptionPane.YES_OPTION){
list.saveToFile();
 System.exit(0); }
 
 if(PromptResult==JOptionPane.NO_OPTION){
 JOptionPane.showMessageDialog(null , "Thank you... it was a pleasure to serve you");
 System.exit(0); } // end if no
   }});







}// end const


public void actionPerformed (ActionEvent event) {

if (event.getSource() instanceof JButton){

String text= ((JButton)(event.getSource())).getText();

switch (text){
case "Add new Car": 
String plateNo = addCarPlateNo.getText();
String price= addCarPrice.getText();
String model = addCarmodel.getText();
String color = addCarcolor.getText();


try{ if ( plateNo.equals("") || price.equals("") || model.equals("") || color.equals(""))
throw new  AnException( "please complete the information");
} catch( AnException e) {JOptionPane.showMessageDialog(null,e.getMessage()); return;}

try{ if ( Double.parseDouble(price) >0 ) {

if ( EconomySelection.isSelected() ){
try{
DriverName.setEnabled(false);  DriverID.setEnabled(false);
Economy a = new Economy ( plateNo, Double.parseDouble(price), model, color );
list.addCar(a);
bill.setText("");
addCarPlateNo.setText("");
addCarPrice.setText("");
addCarmodel.setText("");
addCarcolor.setText("");
DriverID.setText("");
DriverName.setText("");} 

catch (NumberFormatException e) {JOptionPane.showMessageDialog(null, " please enter price of numbers only" ); return;} }//end if 


} else throw new  AnException( "please price should be greater than 0 "); 
}catch (NumberFormatException e) {JOptionPane.showMessageDialog(null, " please enter price of numbers only" ); return;}
 catch( AnException e) {JOptionPane.showMessageDialog(null,e.getMessage()); return;} // end catch


if ( VIPSelection.isSelected() ){
DriverName.setEnabled(true); DriverID.setEnabled(true); 

String DID = DriverID.getText();
String DName = DriverName.getText(); 

try{ if ( DID.equals("") || DName.equals("") )
throw new  AnException( "please complete the information");
} catch( AnException e) {JOptionPane.showMessageDialog(null,e.getMessage()); return;}
  

try { 
Driver driver = new Driver (Integer.parseInt(DID) ,DName);
if (Double.parseDouble(price) >0){
VIP a = new VIP ( plateNo,  Double.parseDouble(price), model, color,driver );

list.addCar(a);
addCarPlateNo.setText("");
addCarPrice.setText("");
addCarmodel.setText("");
addCarcolor.setText("");
DriverID.setText("");
DriverName.setText("");}
 
else throw new  AnException( "please price should be greater than 0 "); 
} catch (NumberFormatException e) {JOptionPane.showMessageDialog(null, " please enter price or driver id of numbers only" );}  
catch( AnException e) {JOptionPane.showMessageDialog(null,e.getMessage()); return; } // end catch 
 }
break; 

case "Show all available Economy cars": 
bill.setText(""); Economy [] Ecolist=null;

if (list== null) JOptionPane.showMessageDialog(null,"the list is empty");
else Ecolist = list.searchAvailableEconomy();

if (Ecolist!=null){
for (int i=0; i<Ecolist.length; i++)
if (Ecolist[i]!=null)
bill.append(Ecolist[i].toString());}

else bill.setText("there's no available Economy cars");


break;
 
case "Show all available VIP cars":
bill.setText(""); VIP [] VIPlist=null;
if (list== null) JOptionPane.showMessageDialog(null,"the list is empty");
else VIPlist = list.searchAvailableVIP();

if (VIPlist == null )
bill.setText("there's no available VIP cars");

if (VIPlist != null ){
for (int i=0; i<VIPlist.length; i++)
if (VIPlist[i]!=null)
bill.append (VIPlist[i].toString() ); }
break; 

case "Rent Car":
String PlateNo = rentCarPlateNo.getText();
String days = RentCarNumOfDays.getText();
String CID = CustomerID.getText();
String CName = CustomerName.getText();
String phone = CustomerPhone.getText();

try{ if ( PlateNo.equals("") || days.equals("") || CID.equals("") || CName.equals("") || phone.equals(""))
throw new  AnException( "please complete the information");
}  catch( AnException e) {JOptionPane.showMessageDialog(null,e.getMessage()); return;}

try{ if ( Integer.parseInt(days)>0 && phone.length() == 10 && phone.substring(0,2).equals("05")){

Customer c = new Customer ( Integer.parseInt(CID), CName, Long.parseLong(phone)); 
list.rentCar(PlateNo, c, Integer.parseInt(days)); bill.setText("");}
else throw new AnException( "please check that number of days is greater than 0 \n and your phone number consists of 10 digis and starts with 05");
}catch (NumberFormatException e) {JOptionPane.showMessageDialog(null, " please number of days, customer id, and phone should consist of numbers only" );return;}  
 catch( AnException e) {JOptionPane.showMessageDialog(null,e.getMessage()); return;}



rentCarPlateNo.setText("");
RentCarNumOfDays.setText("");
CustomerID.setText("");
CustomerName.setText("");
CustomerPhone.setText("");

break;

case "Return Car":
plateNo = ReturnCarPlateNo.getText();

try{ if ( plateNo.equals("") )
throw new  AnException( "please complete the information");
} catch( AnException e) {JOptionPane.showMessageDialog(null,e.getMessage()); return;}

if (list!=null && !plateNo.equals(""))
list.returnCar(plateNo);
ReturnCarPlateNo.setText("");
bill.setText("");
break; }// end switch

}// end if instance of jbutton

if (event.getSource() instanceof JRadioButton)
if ( EconomySelection.isSelected() ){
DriverName.setEnabled(false); DriverID.setEnabled(false);}
else if ( VIPSelection.isSelected() ){
DriverName.setEnabled(true); DriverID.setEnabled(true);} 


}//end action method








}// end class

class AnException extends Exception{
public AnException (String s){
super(s);}}



