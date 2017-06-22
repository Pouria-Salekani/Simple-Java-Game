import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.Scanner;

public class Wass extends JFrame{
	public void Derp(){
	Random bu = new Random();
	Sike pow = new Sike();
	
	String yey = JOptionPane.showInputDialog("Welcome to the Dice game! Press ENTER to continue");
	for(int counter=0;counter<1000;counter++){
		int joke[] = new int[10];
	String guess = JOptionPane.showInputDialog("Guess how many times it will land on Heads out of 10");	
	int item = Integer.parseInt(guess);
	if(item <= 10){
		JOptionPane.showMessageDialog(null, "Heads  \t  Tails" );
		int ww = 0;
	  for(int x:joke){
	++joke[1+bu.nextInt(9)];
		ww +=x;
		}
		JOptionPane.showMessageDialog(null, ww+ "  \t   " +(10-ww) );
		JOptionPane.showMessageDialog(null, "It landed on Heads " +ww+ " times");
		if(item == ww){
			JOptionPane.showMessageDialog(null, "Congralutations! You won! You will be redirected to the next game");
		pow.Hey();
		}else{
			JOptionPane.showMessageDialog(null, "Aww... try again");
		}
		
	}else{
		String juju = JOptionPane.showInputDialog("Please enter a number between 1-10");
	}
}

	}
}
