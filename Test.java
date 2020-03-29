import javax.swing.*;
import java.awt.*;

public class Test{

public static void main (String[]args) {
GUI myFrame;
myFrame = new GUI() ;
myFrame.setVisible(true) ;
}

}//end Test


class GUI extends JFrame {

// I chose random numbers
private static final int FRAME_WIDTH = 600;
private static final int FRAME_HEIGHT = 400;
private static final int FRAME_X_ORIGIN = 150;
private static final int FRAME_Y_ORIGIN = 250;
private JTextField inputLine;

public GUI (){
setTitle("Rental System");
setSize ( FRAME_WIDTH, FRAME_HEIGHT );
setLocation ( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );//frame

setDefaultCloseOperation( EXIT_ON_CLOSE );// exit

Container contentPane = getContentPane() ;
contentPane.setBackground(Color.WHITE) ;//ground color

inputLine = new JTextField();
 inputLine.setColumns(22);
 inputLine.setFont(new Font("Courier", Font.PLAIN, 14));
 contentPane.add(inputLine);
// inputLine.addActionListener(this); // input place 

}



}