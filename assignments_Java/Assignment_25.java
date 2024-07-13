//Write a program for super() calling statement for parameterized and non parameterized.
package assignments_Java;

class State
{
	State()
	{
		System.out.println("State is running");
	}
	State(int a)
	{
		System.out.println("Parameterised constructor running");
	}
}

public class Assignment_25 extends State {
	public Assignment_25(int a) 
	{
		super(10);
		System.out.println("Main class Constructor1 is running");
		
	}
	public Assignment_25() 
	{
		super();
		System.out.println("Main class Constructor2 is running");
		
	}
	
	public static void main(String[] args) 
	{
		new Assignment_25(10);
		new Assignment_25();
		

	}

}
