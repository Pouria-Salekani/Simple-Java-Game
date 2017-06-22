import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Unknown {
public static void main(String args[]){
	Scanner dud = new Scanner (System.in);
	Random abu = new Random();

	Sike chick = new Sike();
	Wass buh = new Wass();
String info = JOptionPane.showInputDialog("Please either type: Dice or Clarify for the game to begin");

switch(info){
case "Clarify":
	chick.Hey();
   break;
case "Dice":
	buh.Derp();
	break;
	default:
	 JOptionPane.showMessageDialog(null, "Please go back and enter one of the following");
	

	
	
     }
   }
}
