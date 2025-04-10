package Demo2;

public class IntCalcTest4 {
	public static void main(String[] args)
	{
	      // Lambda expression can access local variables as long as the vaiables are defined as final
	      final int factor = 10;
	      int num =6;
	      
	      // Create an object that implements IntCalculator.
	      IntCalculator multiplier = x -> x * factor;

	      
	      // Display the number multiplied by 10.
	      System.out.println("Multiplied by 10, that number is " +  
	                         multiplier.calculate(num));     
	   }
}
