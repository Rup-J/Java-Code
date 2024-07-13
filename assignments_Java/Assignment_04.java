package assignments_Java;
//call non static method

public class Assignment_04 {
	void method()
	{
		System.out.println("Non-static method is running");
	}

	public static void main(String[] args) 
	{
		Assignment_04 a = new Assignment_04();
		a.method();
	}

}
