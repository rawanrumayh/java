import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Test{

public static void main (String[]args) {

GUI frame = new GUI ();

frame.setVisible(true);

}}//end Test


class GUI extends JFrame implements ActionListener {
JTextField addCarPlateNo; JTextField addCarPrice; JTextField addCarmodel; 
JTextField addCarcolor; JRadioButton EconomySelection; JRadioButton VIPSelection;  
JTextField DriverID; JTextField DriverName; 
JTextField rentCarPlateNo; JTextField RentCarNumOfDays; JTextField CustomerID;
JTextField CustomerName; JTextField CustomerPhone; JTextField ReturnCarPlateNo; JPanel driverPanel; JTextArea bill;


public GUI (){

setSize(1000,800);
setTitle("Rental System");
setDefaultCloseOperation(EXIT_ON_CLOSE);


JButton AddCar, ShowAllEco, ShowAllVIP, Rent;

Container contentPane = getContentPane(); contentPane.setLayout(null); 


JLabel image = new JLabel (new ImageIcon ("logo1.png"));
image.setSize(256,80);
image.setLocation(10,0); 
contentPane.add(image);


// add new car panel

JPanel addPanel = new JPanel();
addPanel.setSize(350,300); addPanel.setLocation(20,100); addPanel.setBorder(BorderFactory.createTitledBorder("Add new car")); addPanel.setLayout(null);
contentPane.add(addPanel);

AddCar = new JButton("Add new Car"); AddCar.setBounds(115,270,130,20);
addPanel.add(AddCar); AddCar.addActionListener(this);

JLabel text = new JLabel ("plateNo : ");
text.setSize(56,14); text.setLocation(10,30); addPanel.add(text); 

addCarPlateNo = new JTextField(); addCarPlateNo.setSize(98,20); addCarPlateNo.setLocation(100,30); 
addPanel.add(addCarPlateNo); addCarPlateNo.addActionListener(this);

text = new JLabel ("pricePerDay : ");
text.setSize(80,50); text.setLocation(10,50); addPanel.add(text); 


addCarPrice = new JTextField();
addCarPrice.setSize(98,20); addCarPrice.setLocation(100,65);
addPanel.add(addCarPrice); addCarPrice.addActionListener(this);

text = new JLabel ("model : ");
text.setSize(80,50); text.setLocation(10,90); addPanel.add(text); 


addCarmodel = new JTextField();
addCarmodel.setSize(98,20); addCarmodel.setLocation(100,105);
addPanel.add(addCarmodel); addCarmodel.addActionListener(this);

text = new JLabel ("color :");
text.setSize(80,50); text.setLocation(10,130); addPanel.add(text); 


addCarcolor = new JTextField();
addCarcolor.setSize(98,20); addCarcolor.setLocation(100,145);
addPanel.add(addCarcolor); addCarcolor.addActionListener(this);

ButtonGroup group = new ButtonGroup();
 EconomySelection = new JRadioButton ("Economy"); EconomySelection.setBounds(20,190,79,16); addPanel.add(EconomySelection); EconomySelection.addActionListener(this);
 VIPSelection     = new JRadioButton ("VIP");     VIPSelection.setBounds(20,210,44,12);     addPanel.add(VIPSelection);     VIPSelection.addActionListener(this);
group.add(EconomySelection); group.add(VIPSelection);
// driver panel

driverPanel = new JPanel(); 
driverPanel.setSize(160,85); driverPanel.setLocation(160,170); 
driverPanel.setBorder(BorderFactory.createTitledBorder("driver")); 
driverPanel.setLayout(null); addPanel.add(driverPanel);

text = new JLabel ("id :"); 
text.setSize(20,12); text.setLocation(10,30); driverPanel.add(text);
DriverID = new JTextField (); DriverID.setSize(98,20); DriverID.setLocation(55,30); driverPanel.add(DriverID); DriverID.addActionListener(this);

text = new JLabel ("name :"); 
text.setSize(40,12); text.setLocation(10,53); driverPanel.add(text);
DriverName = new JTextField (); DriverName.setSize(98,20); DriverName.setLocation(55,53); driverPanel.add(DriverName); DriverName.addActionListener(this);
DriverName.setEnabled(false);  DriverID.setEnabled(false);



// show information panel

JPanel ShowInfo = new JPanel ();
ShowInfo.setSize(440,245); ShowInfo.setLocation(20,420); 
ShowInfo.setBorder(BorderFactory.createTitledBorder("Show Information")); 
ShowInfo.setLayout(null); contentPane.add(ShowInfo);


ShowAllEco = new JButton("Show all available Economy cars"); ShowAllEco.setBounds(5,20,218,20); ShowAllEco.addActionListener(this);
ShowAllVIP = new JButton("Show all available VIP cars"); ShowAllVIP.setBounds(235,20,200,20); ShowAllVIP.addActionListener(this);
ShowInfo.add(ShowAllEco); ShowInfo.add(ShowAllVIP); 


bill = new JTextArea (); bill.setSize(420,180); bill.setLocation(10,50); ShowInfo.add(bill); //bill.addActionListener(this);

// rent car panel

JPanel RentCar = new JPanel ();
RentCar.setSize(340,300); RentCar.setLocation(500,100); 
RentCar.setBorder(BorderFactory.createTitledBorder("Rent Car")); 
RentCar.setLayout(null); contentPane.add(RentCar);

JLabel text1 = new JLabel ("plateNo :");
text1.setSize(56,14); text1.setLocation(15,30); RentCar.add(text1);
rentCarPlateNo = new JTextField(); rentCarPlateNo.setSize(90,20); rentCarPlateNo.setLocation(100,30); RentCar.add(rentCarPlateNo); rentCarPlateNo.addActionListener(this);

text = new JLabel ("No. of days :");
text.setSize(70,14); text.setLocation(15,60); RentCar.add(text);
RentCarNumOfDays = new JTextField(); RentCarNumOfDays.setSize(90,20); RentCarNumOfDays.setLocation(100,60); RentCar.add(RentCarNumOfDays);RentCarNumOfDays.addActionListener(this);

// customer information panel

JPanel CustomerInfo = new JPanel ();
CustomerInfo.setSize(300,150); CustomerInfo.setLocation(20,90); 
CustomerInfo.setBorder(BorderFactory.createTitledBorder("Customer Information")); 
CustomerInfo.setLayout(null); RentCar.add(CustomerInfo);

text  = new JLabel ("id :");
text.setSize(56,14); text.setLocation(15,30); CustomerInfo.add(text);
CustomerID = new JTextField(); CustomerID.setSize(90,20); CustomerID.setLocation(80,30); CustomerInfo.add(CustomerID); CustomerID.addActionListener(this);

text  = new JLabel ("name :");
text.setSize(56,14); text.setLocation(15,60); CustomerInfo.add(text);
CustomerName = new JTextField(); CustomerName.setSize(90,20); CustomerName.setLocation(80,60); CustomerInfo.add(CustomerName); CustomerName.addActionListener(this);

text  = new JLabel ("phone :");
text.setSize(56,14); text.setLocation(15,90); CustomerInfo.add(text);
CustomerPhone = new JTextField(); CustomerPhone.setSize(90,20); CustomerPhone.setLocation(80,90); CustomerInfo.add(CustomerPhone); CustomerPhone.addActionListener(this);

Rent  = new JButton("Rent Car"); Rent.setBounds(120,260,100,20);
RentCar.add(Rent);  Rent.addActionListener(this);


//Return car panel

JPanel ReturnCar = new JPanel ();
ReturnCar.setSize(400,130); ReturnCar.setLocation(500,500); 
ReturnCar.setBorder(BorderFactory.createTitledBorder("Renturn Car")); 
ReturnCar.setLayout(null); contentPane.add(ReturnCar);

text  = new JLabel ("plateNo :");
text.setSize(56,14); text.setLocation(15,30); ReturnCar.add(text);
ReturnCarPlateNo = new JTextField(); ReturnCarPlateNo.setSize(90,20); ReturnCarPlateNo.setLocation(80,30); ReturnCar.add(ReturnCarPlateNo); ReturnCarPlateNo.addActionListener(this);

JButton Return = new JButton("Return Car"); Return.setBounds(120,100,100,20); ReturnCar.add(Return); Return.addActionListener(this);










}// end const


public void actionPerformed (ActionEvent event) {
if (event.getSource() instanceof JButton){

String text= ((JButton)(event.getSource())).getText();
CarRental list = new CarRental (100);
switch (text){
case "Add new Car": 
String plateNo = addCarPlateNo.getText();
double price= Double.parseDouble(addCarPrice.getText());
String model = addCarmodel.getText();
String color = addCarcolor.getText();


if ( EconomySelection.isSelected() ){
Economy a = new Economy ( plateNo, price, model, color );
list.addCar(a);
}

if ( VIPSelection.isSelected() ){
DriverName.setEnabled(true); DriverID.setEnabled(true); // not working
Driver driver = new Driver (Integer.parseInt(DriverID.getText()) ,DriverName.getText());

VIP a = new VIP ( plateNo, price, model, color,driver );
list.addCar(a);
}
break;

case "Show all available Economy cars": 
Car [] Ecolist = list.searchAvailableEconomy();
String s="";
for (int i=0; i<Ecolist.length; i++){
if (Ecolist[i] != null )
s+=Ecolist[i];}
bill.setText(s);

break; 

case "Show all available VIP cars":
Car [] VIPlist = list.searchAvailableVIP();
String w="";
for (int i=0; i<VIPlist.length; i++){
if (VIPlist[i] != null )
w+=VIPlist[i];}
bill.setText(w);
break; 

case "Rent Car":
String PlateNo = rentCarPlateNo.getText();
int days = Integer.parseInt(RentCarNumOfDays.getText());
Customer c = new Customer ( Integer.parseInt(CustomerID.getText()), CustomerName.getText(), Long.parseLong(CustomerPhone.getText()));
list.rentCar(PlateNo, c, days);
break;

case "Return Car":
list.returnCar(ReturnCarPlateNo.getText());
break;

 }// end switch

}

}//end action method


}// end class



