/****************************************************************
 *	Application to get the (k+1)st entry in Pascal's Triangle 	*
 *																*
 *	Daniel Botha 			20078196				  9/02/16 	*
 ****************************************************************/

import java.util.Scanner;

public class BinomialApp{
	
	public static void main(String[] args) {

		System.out.print("To which factor do you want to multiply (x+y)? ");
		Scanner s = new Scanner(System.in);

		String selection = ""+s.next();
		int factors = Integer.parseInt(selection);

		System.out.println("You selected: "+factors);

		for (int i=0; i<=factors; i++) {
			System.out.println("Coefficient " + (i+1) + ": " + pascalEntry(factors, i));
		}
	}

	// Method to calculate the nCk of each iteration
	public static int pascalEntry(int n, int k){
		return (getFact(n)/(getFact(k)*getFact(n-k)));
	}


	// Method to get the factorial of an integer n
	public static int getFact(int n){
		if (n>1) 
			return n*getFact(n-1);
		else
			return 1;
	}

}

/*
0						1
1					1	2	1
2				1	  3   3     1
3			1		4	6	4		1
4		1								1
5	1										1												1
	
*/