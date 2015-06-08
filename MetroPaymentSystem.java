package MetroPaymentSystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MetroPaymentSystem {
    public static void main(String[] args){
    	SmartTrip st;
    	//FairCard fc;
    	JFrame frame = new JFrame();
    	
    	String[] options = {"Get SmartTrip card"};
int n = JOptionPane.showOptionDialog(frame,
"Do you want to get a SmartTrip Card?","Metro Payment System",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,null);
    
    if(n == 0) st = new SmartTrip();
    //if(n == 1) fc = new FairCard();
    System.exit(0);
    }
}
