package assignments_Java;
// Multi level inheritance for static method

class a
{
	static void method_1()
	{
		System.out.println("Method 1 from class A is running...");
	}
}

class b extends a
{
	static void method_2()
	{
		System.out.println("Method 2 from class B is running...");
		method_1();
	}
}

public class Assignment_20 extends b
{
	public static void main(String[] args) 
	{
		method_1();
		method_2();
	}

}
