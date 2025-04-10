package Demo2;

public class Subcls implements IntCalculator{
	 public int calculate(int number) {
		 System.out.println("In the Subclass of the IntCalculator interface ");
		 return number*number;
		}
}
