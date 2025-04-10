package Demo3;
@FunctionalInterface
/*
 A functional interface is an interface with just one abstract method.
 The MathOperation is a functional interface with only one abstract method, operation (int a, int b). 
 The @FunctionalInterface annotation confirms this, and we use a lambda expression to implement the interface
 in a single line. 
 */
interface MathOperation {
    int operation(int a, int b);
}