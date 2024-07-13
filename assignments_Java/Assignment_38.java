//Try Out for char  and boolean
package assignments_Java;

public class Assignment_38 {

	public static void main(String[] args) 
	{
		// defining array for char
		
		char [] c1 = new char[3];
		c1[0] ='A';
		c1[1] ='a';
		c1[2] ='B';
		
		for(int i=0 ; i<3 ; i++)
		{
			System.out.println(c1[i]);
		}
		
		//defining array for boolean
		boolean b1 [] = new boolean[2];
		b1[0] = true;
		b1[1] = false;
		
		for(int j=0; j<2 ; j++)
		{
			System.out.println(b1[j]);
		}
	}

}
