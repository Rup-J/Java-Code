package assignments_Java;

import java.util.Scanner;

public class Assignment_16 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first name: ");
		String firstname= s.next();
		
		System.out.println("Enter the last name: ");
		String lastname= s.next();
		
		System.out.println("Enter the email : ");
		String email = s.next();
		
		System.out.println("Enter the Password: ");
		String pwd= s.next();
		
		System.out.println("Enter the gender : ");
		String gender = s.next();
		
		System.out.println("Enter the Present address : ");
		String pre_add= s.next();
		
		System.out.println("Enter the permanent address : ");
		String perm_add = s.next();
		
		System.out.println("Enter the Pincode: ");
		int pincode= s.nextInt();
		
		// Printing all the values
		System.out.println("first name: "+ firstname);
		System.out.println("last name: "+ lastname);
		System.out.println("Email: "+ email);
		System.out.println("Password: "+ pwd);
		System.out.println("Gender: "+ gender);
		System.out.println("Present address: "+ pre_add);
		System.out.println("Permanent address: "+ perm_add);
		System.out.println("Pincode: "+ pincode);
	
	}

}
