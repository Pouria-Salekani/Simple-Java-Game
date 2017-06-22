import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;


public class Sike extends JFrame{
	public void Hey(){
	Wass yol = new Wass();
		String name = JOptionPane.showInputDialog("Welcome to the Clarify game! Type in your name: ");
		Scanner ded = new Scanner(System.in);
		String age = JOptionPane.showInputDialog(null, "Almost there.... type in your age next: ");
		int item = Integer.parseInt(age);
		
		String hehe = JOptionPane.showInputDialog(" 'TYPE IN Yes OR No' To clarify, your name is " + name + " and you are " +age+ " old");
		if(age == age && name == name){
			JOptionPane.showMessageDialog(null, "Fantastic! You will be redirected to the next game");
			yol.Derp();
			
		}else{
			JOptionPane.showMessageDialog(null, "Please try again");
		}
	}
		
	}
	
	

