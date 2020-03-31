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

setSize(1000,700);
setTitle("Rental System");
setDefaultCloseOperation(EXIT_ON_CLOSE);


JButton AddCar, ShowAllEco, ShowAllVIP, Rent, ReturnCar;
AddCar     = new JButton("Add new Car"); AddCar.setBounds(100,360,150,30);
ShowAllEco = new JButton("Show all available Economy cars"); ShowAllEco.setBounds(400,300,250,30);
ShowAllVIP = new JButton("Show all available VIP cars"); ShowAllVIP.setBounds(200,400,250,30);
Rent       = new JButton("Rent Car"); Rent.setBounds(250,500,100,30);
ReturnCar  = new JButton("Return Car"); ReturnCar.setBounds(300,600,100,30);

Container contentPane = getContentPane(); contentPane.setLayout(null);
contentPane.add(AddCar); contentPane.add(ShowAllEco); contentPane.add(ShowAllVIP); contentPane.add(Rent); contentPane.add(ReturnCar);
AddCar.addActionListener(this); ShowAllEco.addActionListener(this); ShowAllVIP.addActionListener(this); Rent.addActionListener(this); ReturnCar.addActionListener(this);


JLabel image = new JLabel (new ImageIcon ("rsz_4logo.png"));
image.setSize(225,98);
image.setLocation(400,10);
contentPane.add(image);

JPanel j = new JPanel();
j.setSize(300,300); j.setLocation(20,100); j.setBorder(BorderFactory.createTitledBorder("Add new car"));
contentPane.add(j);


JLabel text = new JLabel ("plateNO : ");
text.setSize(0,0); text.setLocation(0,0); j.add(text); 


JTextField input = new JTextField();
input.setColumns(6);
j.add(input); 

text = new JLabel ("pricePerDay : ");
text.setSize(100,100); text.setLocation(100,100); j.add(text);


input = new JTextField();
input.setColumns(6);
j.add(input);

text = new JLabel ("model : ");
text.setSize(0,0); text.setLocation(0,0); j.add(text); 


input = new JTextField();
input.setColumns(6);
j.add(input);

text = new JLabel ("color :");
text.setSize(0,0); text.setLocation(0,0); j.add(text); 


input = new JTextField();
input.setColumns(6);
j.add(input);

JRadioButton Economy = new JRadioButton ("Economy"); Economy.setBounds(40,250,10,10);j.add(Economy);
JRadioButton VIP = new JRadioButton ("VIP"); Economy.setBounds(40,270,10,10); j.add(VIP);







}// end const


public void actionPerformed (ActionEvent event) {

if (event.getSource() instanceof JButton){

String buttonText =( (JButton)(event.getSource()) ).getText();
setTitle("You clicked "+buttonText);}

}//end action method


}// end class



