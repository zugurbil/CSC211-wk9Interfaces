package Demo1;

public class MyInterfaceTest3 {
	public static void main(String[] args) {
		
		/*Lambda expression like an anonymous method, or a method with no name.
        */
				 
		MyInterface1 obj  =  () ->  System.out.println("Hello from the inner class method");
				obj.show(); 
			}
}

/* In the previous example MyInterfaceTest2;
/* MyInterface1 obj = new MyInterface1()    {
 *           public void show() {
 *           System.out.println("Hello from the inner class method"); }
 *	        };
 *
 *Step 1: 
 *	in statement 	  MyInterface1 obj = new MyInterface1()  {
 *       remove       new MyInterface1,    ie  MyInterface1 obj = ()
 *       remove       public void show() {  in the second line of the anonymous method
 *       result:
 *                    MyInterface1 obj  =  ()
 * 	                    {
 *			              System.out.println("Hello from the inner class method");
 *   	                }
 * 3- Remove the brackets and introduce the lambda expression  - > 
 * result:
 * 		MyInterface1 obj  =  () -> System.out.println("Hello from the inner class method");
 *      () indicates that there is no parameters
 */   	
