package boolean_logic;

import javax.swing.JOptionPane;

public class BooleanLogic {
	public static void main(String[] args) {
			String n=JOptionPane.showInputDialog("Enter a number: ");
			int num=Integer.parseInt(n);

			// Implement functionality that checks if the number is divisible 2, 3, or both. If it isn't, say
			// that the number is not divisible by 3 or 2
			//------------------------------------------------------------------------------------------------
			
			if(num%2==0 && num%3==0)
				System.out.println("The number is divisible by 2 and 3");
			else if(num%2==0)
				System.out.println("The number is divisible by 2");
			else if(num%3==0)
				System.out.println("The number is divisible by 3");
			else
				System.out.println("The number is not divisible by 3 or 2");
	}
}
