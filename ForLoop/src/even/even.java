package even;

import javax.swing.JOptionPane;

public class even {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Get inputs from User
		String a=JOptionPane.showInputDialog("Enter a starting number:");
		String b=JOptionPane.showInputDialog("Enter an ending number:");
		
		//change the variable type to integers
		int start=Integer.parseInt(a);
		int end=Integer.parseInt(b);
		
		// THIS IS WRONG. EXPLAIN WHY AND FIX IT
		int sum=0;
		for(int i=start;i<=end;i++){
			if(i%3==0)
				sum+=i;
			if(i%4==0)
				sum+=i;
			if(i%5==0)
				sum+=i;
		}
		
		//Print out the sum
		System.out.println("The sum of all numbers is "+sum);

	}

}
/*
 *  The point of this assignment is to create a program that takes in a starting number i and and end number j. And then adds up all
 *  the numbers from i to j that are multiples of 3,5, or 4.
 *  
 *  Example
 *  
 *  Start number=3
 *  End number=25
 *  
 *  sum=3+6+9+12+15+18+21+24+4+8+16+20+5+10+15+20+25
 * 
 */