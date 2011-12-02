import javax.swing.JOptionPane;

/*
 *  The point of this assignment is to create a summation program that takes in a starting number i and and end number j. And then adds up all
 *  the numbers from i to j. 
 *  
 *  Example
 *  
 *  Start number=3
 *  End number=7
 *  
 *  3+4+5=6+7=25
 * 
 */
public class ForLoop {
	
	public static void main(String[] args) {

		//Get inputs from User
		String a=JOptionPane.showInputDialog("Enter a starting number:");
		String b=JOptionPane.showInputDialog("Enter an ending number:");
		
		//change the variable type to integers
		int start=Integer.parseInt(a);
		int end=Integer.parseInt(b);
		
		int sum=0;
		
		// Write this portion of the code
		//---------------------------------------------------
		for(int i=start;i<=end;i++){
			sum+=i;
		}
		//---------------------------------------------------
		
		//Print out the sum
		System.out.println("The sum of all numbers is "+sum);
		
	}

}


