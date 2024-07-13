package assignments_Java;
//Herirachial level inheritance concept using 5 classes

class mall
{
	 void method_1()
	{
		System.out.println("Method 1 from class A is running...");
	}
}

class shop1 extends mall
{
	 void method_2()
	{
		System.out.println("Method 2 from shop1 is running...");
		method_1();
	}
}
class shop2 extends mall
{
	 void method_3()
	{
		System.out.println("Method 3 from shop2 is running...");
		method_1();
	}
}
class shop3 extends mall
{
	 void method_4()
	{
		System.out.println("Method 4 from shop3 is running...");
		method_1();
	}
}
public class Assignment_23 extends mall
{
	public static void main(String[] args) 
	{
		Assignment_23 a2 = new Assignment_23();
		a2.method_1();
		
	}

}