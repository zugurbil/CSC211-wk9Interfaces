package Demo2;

/* 
 * Create an  Anonymous inner class:
 */

public class IntCalcTest2 {
	public static void main(String[] args)
	{
	   int num=8;
	  	   
	   IntCalculator square = new IntCalculator() { /*instance of an anonymous class*****/
	      public int calculate(int number)   /*****method in the anonymous class****/
	      {
	         return number * number;
	      }};

	   // Display the square of the number.
	   System.out.println("The square is " + square.calculate(num));     
	   	}
	}
