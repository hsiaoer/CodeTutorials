package basic;

import javax.swing.JOptionPane;

public class Menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String a=JOptionPane.showInputDialog("Here's a Menu for Lunch\n" +
				"1) Bread \n" +
				"2) Water\n" +
				"3) Potatoes\n" +
				"4) Rice\n" +
				"5) Carrots\n\n" +
				"Please Select Your Choice (1-5). \n If you do not choose correctly you will get nothing to eat!:");
		
		int choice=Integer.parseInt(a);
		
		//Implement a way to print out your selection using if/else statements
		//--------------------------------------------------------------------
		String selection="";
		if(choice==1)
			selection="bread";
		else if(choice==2)
			selection="water";
		else if(choice==3)
			selection="potatoes";
		else if(choice==4)
			selection="rice";
		else if(choice==5)
			selection="carrots";
		else
			selection="None";
		
		System.out.println("Your selection(if/else): "+selection);
		
		// Implement using switch/case statements
		//--------------------------------------------------------------------
		selection="";
		
		switch(choice){
			case(1):
				selection="bread";
				break;
			case(2):
				selection="water";
				break;
			case(3):
				selection="potatoes";
				break;
			case(4):
				selection="rice";
				break;
			case(5):
				selection="carrots";
				break;
			default:
				selection="None";
				break;
		}
		System.out.println("Your selection(switch case): "+selection);
		

	}

}
