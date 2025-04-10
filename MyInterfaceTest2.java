package Demo1;
/* 
 * Introduction to Anonymous Class:
 */
public class MyInterfaceTest2 {
	 public static void main(String[] args) {
		/*
		 * instance of an anonymous class**** 
		 * -Has no name and defined in another class.
		 * -Must implement an interface.
		 * MyInterface1 is an interface with a method named show.
		 * anonymousObj is an a refence variable that implements Myinterface1
		 * by using the anonymous class which does not have a name.
		 * The show method in the anonymous class overrides the show method in Myinterface1.
		 * Hence anonymousObj is an instance of a anonymous class.
		 */
		 
	    MyInterface1 anonymousObj = new MyInterface1()  
			{   /*****method in the anonymous class****/
				public void show()    
				{
				System.out.println("Hello from the inner class method"); 
			    }   
			};
		anonymousObj.show();
     }
}        
