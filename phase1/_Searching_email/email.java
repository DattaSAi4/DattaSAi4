package _Searching_email;

import java.util.Scanner;

//You have an array of email IDs of employees.
//As a programmer, write a program to search the email ID entered by a user.
public class email {
	public static void main(String[] args)
	{
	
	String email[] = {"psaivinay123@gmail.com","psaivinay2@gmail.com"};
	
	while(true)
	{
     System.out.println(" ");
    System.out.println("enter the email id");
	Scanner s1 = new Scanner(System.in);
	      String value = s1.next();
	      email1(email,value);
	}
	}

	public static void email1(String[] email, String value) {
		for(int i=0;i<email.length;i++)
		{
			if(email[i].equals(value))
			{
				System.out.println("THE GIVEN EMAIL IS VALID :" +email[i]);  
				break;
			}
			else if(!email[i].equals(value))
			{
				System.out.println("SORRY I GIVEN MAIL IS NOT VALID");
				break;
			}
		
		
		}
		
		
		  
	}
	

}
