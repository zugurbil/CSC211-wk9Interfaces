package Demo2;

public class IntCalcTest1 {
	public static void main(String[] args) {
		 //IntCalculator  obj = new Intcalculator(); //will not work, can not initiate an interface.
		IntCalculator square = new Subcls();
		System.out.println("The square is " + square.calculate(4));
		}
}
