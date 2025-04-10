package Demo1;

public class MyInterfaceTest1 {
	public static void main(String[] args) { 
		//	Myinterface1 obj = Myinterface1 A(); //will not work, can not instantiate an interface.
		MyInterface1 obj = new SubclassB();
			obj.show();
		}
}
