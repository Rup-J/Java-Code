package assignments_Java;
//Herirachial level inheritance concept using 2 classes

class tester1
{
	 void method_1()
	{
		System.out.println("Method 1 from class A is running...");
	}
}

class tester2 extends tester1
{
	 void method_2()
	{
		System.out.println("Method 2 from class B is running...");
		method_1();
	}
}

public class Assignment_22 extends tester1
{
	public static void main(String[] args) 
	{
		Assignment_21 a2 = new Assignment_21();
		a2.method_1();
		a2.method_2();
	}

}
