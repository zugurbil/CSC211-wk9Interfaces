
public interface Relatable
	{
	   boolean equals(GradedActivity g);
	   boolean isGreater(GradedActivity g);
	   boolean isLess(GradedActivity g);
	   
	   default void display() {
		   System.out.println(" This is the defaul Display");
	   }
}


