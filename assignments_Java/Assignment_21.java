package assignments_Java;
//Multi-level inheritance for Non-static method

class test1
{
	 void method_1()
	{
		System.out.println("Method 1 from class A is running...");
	}
}

class test2 extends test1
{
	 void method_2()
	{
		System.out.println("Method 2 from class B is running...");
		method_1();
	}
}

public class Assignment_21 extends test2
{
	public static void main(String[] args) 
	{
		Assignment_21 a2 = new Assignment_21();
		a2.method_1();
		a2.method_2();
	}

}