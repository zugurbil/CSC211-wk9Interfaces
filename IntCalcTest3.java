package Demo2;

public class IntCalcTest3 {
	public static void main(String[] args)
	{
	   int num = 8;
	   // Create an object that implements IntCalculator.
	   
	   /* IntCalculator is an Functional interface. Use lambda expression
	    * to create an object overrides the abstract method. 
	    * Will accept one parameter and return a value.
	    * x on the left is the input parameter, and x*x is the returned value.
	    */
	   IntCalculator square = x -> x * x;

	   // Display the square of the number.
	   System.out.println("The square is " + square.calculate(num)); 
	}
}
/* Anonymous inner class was;
 *    IntCalculator square = new IntCalculator() { /*instance of an anonymous class****
 *	      public int calculate(int number)   /*****method in the anonymous class****
 *	      {
 *	         return number * number;
 *	      }};   
 *
 *Step 1: 
*	in statement 	  IntCalculator square = new IntCalculator()  {
*       remove       new IntCalculator1(),    ie  IntCalculator1 square = x
*       remove       public int calculate(int number) {  
*       result:
*                    IntCalculator square =  x
* 	                    {
*			              return number * number;
*   	                }
* 3- Remove the brackets and introduce the lambda expression  - > 
* result:
* 		IntCalculator square  =  x -> x * x;
*/   	 

  

