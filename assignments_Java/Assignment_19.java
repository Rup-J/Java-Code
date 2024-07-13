package assignments_Java;
//Single level inheritance


class Class_01
{
	void add()
	{
		System.out.println("parent class running");
	}

}

public class Assignment_19 extends Class_01
{

	public static void main(String[] args) 
	{ 
		Assignment_19 a1 = new Assignment_19();
		a1.add();
	}

}
