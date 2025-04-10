  package Demo3;

public class MathOperationDemo {
    public static void main(String[] args) {
        // Lambda expression with two parameters
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;

        System.out.println("Addition: " + addition.operation(5, 3)); 
        System.out.println("Subtraction: " + subtraction.operation(5, 3));
        System.out.println("Multiplication: " + multiplication.operation(5, 3));
        System.out.println("***********************************");
        System.out.println("Addition: " + operate(5, 3, addition)); // Output: 8
        System.out.println("Subtraction: " + operate(5, 3, subtraction)); // Output: 2
        System.out.println("Multiplication: " + operate(5, 3, multiplication)); 
    }

    private static int operate(int a, int b, MathOperation interfaceObject) {
        return interfaceObject.operation(a, b);
    }

}
