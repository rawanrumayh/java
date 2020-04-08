import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Test{

public static void main (String[]args) {

GUI frame = new GUI ();

frame.setVisible(true);

}}//end Test


class GUI extends JFrame implements ActionListener {


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
addPanel.add(AddCar); 

JLabel text = new JLabel ("plateNo : ");
text.setSize(56,14); text.setLocation(10,30); addPanel.add(text); 


JTextField input = new JTextField(); input.setSize(98,20); input.setLocation(100,30); 
addPanel.add(input); 

text = new JLabel ("pricePerDay : ");
text.setSize(80,50); text.setLocation(10,50); addPanel.add(text);


input = new JTextField();
input.setSize(98,20); input.setLocation(100,65);
addPanel.add(input);

text = new JLabel ("model : ");
text.setSize(80,50); text.setLocation(10,90); addPanel.add(text); 


input = new JTextField();
input.setSize(98,20); input.setLocation(100,105);
addPanel.add(input);

text = new JLabel ("color :");
text.setSize(80,50); text.setLocation(10,130); addPanel.add(text); 


input = new JTextField();
input.setSize(98,20); input.setLocation(100,145);
addPanel.add(input);

JRadioButton Economy = new JRadioButton ("Economy"); Economy.setBounds(20,190,79,16); addPanel.add(Economy);
JRadioButton VIP     = new JRadioButton ("VIP");         VIP.setBounds(20,210,44,12); addPanel.add(VIP);

// driver panel

JPanel driverPanel = new JPanel(); 
driverPanel.setSize(160,85); driverPanel.setLocation(160,170); 
driverPanel.setBorder(BorderFactory.createTitledBorder("driver")); 
driverPanel.setLayout(null); addPanel.add(driverPanel);

text = new JLabel ("id :"); 
text.setSize(20,12); text.setLocation(10,30); driverPanel.add(text);
input = new JTextField (); input.setSize(98,20); input.setLocation(55,30); driverPanel.add(input); 

text = new JLabel ("name :"); 
text.setSize(40,12); text.setLocation(10,53); driverPanel.add(text);
input = new JTextField (); input.setSize(98,20); input.setLocation(55,53); driverPanel.add(input); 


// show information panel

JPanel ShowInfo = new JPanel ();
ShowInfo.setSize(440,245); ShowInfo.setLocation(20,420); 
ShowInfo.setBorder(BorderFactory.createTitledBorder("Show Information")); 
ShowInfo.setLayout(null); contentPane.add(ShowInfo);

ShowAllEco = new JButton("Show all available Economy cars"); ShowAllEco.setBounds(5,20,218,20);
ShowAllVIP = new JButton("Show all available VIP cars"); ShowAllVIP.setBounds(235,20,200,20);
ShowInfo.add(ShowAllEco); ShowInfo.add(ShowAllVIP); 

JTextArea bill = new JTextArea (); bill.setSize(420,180); bill.setLocation(10,50); ShowInfo.add(bill);

// rent car panel

JPanel RentCar = new JPanel ();
RentCar.setSize(340,300); RentCar.setLocation(500,100); 
RentCar.setBorder(BorderFactory.createTitledBorder("Rent Car")); 
RentCar.setLayout(null); contentPane.add(RentCar);

JLabel text1 = new JLabel ("plateNo :");
text1.setSize(56,14); text1.setLocation(15,30); RentCar.add(text1);
input = new JTextField(); input.setSize(90,20); input.setLocation(100,30); RentCar.add(input);

text = new JLabel ("No. of days :");
text.setSize(70,14); text.setLocation(15,60); RentCar.add(text);
input = new JTextField(); input.setSize(90,20); input.setLocation(100,60); RentCar.add(input);

// customer information panel

JPanel CustomerInfo = new JPanel ();
CustomerInfo.setSize(300,150); CustomerInfo.setLocation(20,90); 
CustomerInfo.setBorder(BorderFactory.createTitledBorder("Customer Information")); 
CustomerInfo.setLayout(null); RentCar.add(CustomerInfo);

text  = new JLabel ("id :");
text.setSize(56,14); text.setLocation(15,30); CustomerInfo.add(text);
input = new JTextField(); input.setSize(90,20); input.setLocation(80,30); CustomerInfo.add(input);

text  = new JLabel ("name :");
text.setSize(56,14); text.setLocation(15,60); CustomerInfo.add(text);
input = new JTextField(); input.setSize(90,20); input.setLocation(80,60); CustomerInfo.add(input);

text  = new JLabel ("phone :");
text.setSize(56,14); text.setLocation(15,90); CustomerInfo.add(text);
input = new JTextField(); input.setSize(90,20); input.setLocation(80,90); CustomerInfo.add(input);

Rent  = new JButton("Rent Car"); Rent.setBounds(120,260,100,20);
RentCar.add(Rent); 


//Return car panel

JPanel ReturnCar = new JPanel ();
ReturnCar.setSize(400,130); ReturnCar.setLocation(500,500); 
ReturnCar.setBorder(BorderFactory.createTitledBorder("Renturn Car")); 
ReturnCar.setLayout(null); contentPane.add(ReturnCar);

text  = new JLabel ("plateNo :");
text.setSize(56,14); text.setLocation(15,30); ReturnCar.add(text);
input = new JTextField(); input.setSize(90,20); input.setLocation(80,30); ReturnCar.add(input);

JButton Return = new JButton("Return Car"); Return.setBounds(120,100,100,20); ReturnCar.add(Return);










}// end const


public void actionPerformed (ActionEvent event) {
if (event.getSource() instanceof JButton){

String buttonText =( (JButton)(event.getSource()) ).getText();
setTitle("You clicked "+buttonText);}

}//end action method


}// end class



