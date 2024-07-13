package assignments_Java;
//call multiple non static method
public class Assignment_05 {
	void method1()
	{
		System.out.println("Non-static method 1 is running");
	}
	void method2()
	{
		System.out.println("Non-static method 2 is running");
	}
	void method3()
	{
		System.out.println("Non-static method 3 is running");
	}

	public static void main(String[] args) 
	{
		Assignment_05 a1 = new Assignment_05();
		a1.method1();
		a1.method2();
		a1.method3();

	}

}
