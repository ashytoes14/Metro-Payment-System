package MetroPaymentSystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SmartTrip {
	
	private int counter = 0;
	private int reply;
	private String bal;
	private String[] options = {"7-day short pass ($28.00)","Balance (you decide price)","Fo' life nigga ($300.00)"};
	private JFrame frame = new JFrame();
	private String creditcard;
    
	public void sevenday(){
		reply = JOptionPane.showConfirmDialog(null, "Are you sure about this?");
		if(reply == JOptionPane.YES_OPTION){
		
		creditcard = JOptionPane.showInputDialog("Please enter your credit card number:");
		while(creditcard.equals("")){
			creditcard = JOptionPane.showInputDialog("Enter your creditcard number:");
		    counter++;
		    //System.out.println(counter);
		    if(counter == 3){
		    	JOptionPane.showMessageDialog(null, "You stupid!");
		    	System.exit(0);
		    }
		}
        
		JOptionPane.showMessageDialog(null, "Welcome "+creditcard + "! You paid $28.00. You can now ride the subway for seven days!");				
		}
		
	}
	
	public void balance(){
		reply = JOptionPane.showConfirmDialog(null, "Are you sure about this?");
		if(reply == JOptionPane.YES_OPTION){
		
		creditcard = JOptionPane.showInputDialog("Enter your creditcard number:");
		
		while(creditcard.equals("")){
			creditcard = JOptionPane.showInputDialog("Enter your creditcard number:");
			counter++;
		    //System.out.println(counter);
		    if(counter == 3){
		    	JOptionPane.showMessageDialog(null, "You stupid!");
		    	System.exit(0);
		    }
				}
		
		bal = JOptionPane.showInputDialog(null, "Welcome "+creditcard+"! How much would you like to put in your card?");
		JOptionPane.showMessageDialog(null, "Thank you! You are free to ride the subway until your $"+bal
				+" runs out.");
		}
			}
	
	public void life(){
		reply = JOptionPane.showConfirmDialog(null, "Are you sure about this?");
		if(reply == JOptionPane.YES_OPTION){		
		creditcard = JOptionPane.showInputDialog("Enter your creditcard number:");
		
		while(creditcard.equals("")){
			creditcard = JOptionPane.showInputDialog("Enter your creditcard number:");
			counter++;
		    //System.out.println(counter);
		    if(counter == 3){
		    	JOptionPane.showMessageDialog(null, "You stupid!");
		    	System.exit(0);
		    }
		    	
				}

		
		JOptionPane.showMessageDialog(null, "Welcome "+creditcard+"! You just paid $300.00");
		JOptionPane.showMessageDialog(null, "Thank you!");
		}
	}
	
	public SmartTrip(){
    	System.out.println("You are using SmartTrip!");
    	int n = JOptionPane.showOptionDialog(frame,"What type of service would you like to get?","Metro Payment System",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,null);
    	
    	if(n==0){
    		sevenday();
    	}
    	
    	if(n==1){
    		balance();
    	}
    	
    	if(n==2){
    		life();
    	}
    }
}
