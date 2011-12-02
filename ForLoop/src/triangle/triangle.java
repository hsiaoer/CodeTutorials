package triangle;

import javax.swing.JOptionPane;

public class triangle {
	
	/*
	 *  The point of this assignment print out a right angle triangle, an equilateral triangle, and a diamond. 
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Get inputs from User
		String character=JOptionPane.showInputDialog("Enter the what character you'd like to use for the triangle: ");
		String a=JOptionPane.showInputDialog("Enter the base of the triangle: ");
		
		//change the variable type to integers
		int base=Integer.parseInt(a);
		
		// Right Angle Triangle:
		//---------------------------------------------------
		System.out.println("Right angle triangle with a base of "+base+"\n");
		
		//Write this portion of the code to print a right angle triangle
		for(int i=1;i<=base;i++){
			for(int j=0;j<i;j++)
				System.out.print(character+" ");
			System.out.println();
		}
		
		
		//---------------------------------------------------
		spaceOut();
		
		
		//Equilateral Triangle
		//---------------------------------------------------
		System.out.println("Equilateral Triangle: \n");
		
		//Write this portion of code
		int padded_spaces=base-2;
		for(int i=1;i<=base;i++){
			for(int j=0;j<=padded_spaces;j++)
				System.out.print(" ");
			for(int j=0;j<i;j++)
				System.out.print(character+" ");
			System.out.println();
			
			padded_spaces--;
		}
		
		//---------------------------------------------------
		
		spaceOut();
		
		
		//Diamond: Width is the base value
		//---------------------------------------------------
		System.out.println("Diamond:\n");
		
		//Write this portion of code: Solution is the most common way
		
		//Creates upper triangle
		padded_spaces=base-1;
			for(int i=1;i<=base;i++){
				for(int j=0;j<padded_spaces;j++)
					System.out.print(" ");
				for(int j=0;j<i;j++)
					System.out.print(character+" ");
				System.out.println();
					
				padded_spaces--;
			}
		//Creates lower upside down triangle
		padded_spaces=1;
			for(int i=base-1;i>=1;i--){
				for(int j=0;j<padded_spaces;j++)
					System.out.print(" ");
				for(int j=0;j<i;j++)
					System.out.print(character+" ");
				System.out.println();
					
				padded_spaces++;
			}
		
		
	}
	public static void spaceOut(){
		System.out.println("\n\n");
	}

}
