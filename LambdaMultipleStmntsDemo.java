package Demo3;

/*
 *  Lambda expression with multiple statements in the body
 */


@FunctionalInterface
interface Greeting {
    void greet(String name);
}

public class LambdaMultipleStmntsDemo{
    public static void main(String[] args) {
        // Lambda expression with multiple statements in the body
        Greeting greeting = (name) -> {
            System.out.println("Hello, " + name + "!");
            System.out.println("Hope you are having a great day!");
        };
        
        // Calling the greet method
        greeting.greet("Alice"); 
    }
}
