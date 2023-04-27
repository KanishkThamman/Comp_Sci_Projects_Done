/**
 *Author : Kanishk Thamman
 *Class : COMPSCI 4a
 *Date : 04th APR 2023
 *Description : A program that takes phone numbers in text value and converts it to phone numbers
 **/

import java.util.*;
public class Tele
{
	public static void main(String args[])

	{


		Scanner sc = new Scanner(System.in); //Scanner

		System.out.println("Enter Num:- ");
			String userInput = sc.nextLine(); // Asks user input
		while(userInput.length() != 10) // checks if input length is 10
		{
			System.out.println("Pls enter 10 degits Num:- ");
				userInput = sc.nextLine();

		}
		char val = 25;// for the for loop
		String ans = "("; //Ans string
		for(char count = 0; count <= userInput.length() -1 ; count++) // for loop to go through all teh values in user input
		{
			val = userInput.charAt(count);

			//Condtion statments that convert the chars to a numbers//

			if(val == 'A' ||val == 'B'||val == 'C' )
				ans+="2";
			else if(val == 'D' ||val == 'E'||val == 'F' )
				ans+="3";
			else if(val == 'G' ||val == 'H'||val == 'I' )
				ans+="4";
			else if(val == 'J' ||val == 'K'||val == 'L' )
				ans+="5";
			else if(val == 'M' ||val == 'N'||val == 'O' )
				ans+="6";
			else if(val == 'P' ||val == 'Q'||val == 'R' || val == 'S')
				ans+="7";
			else if(val == 'T' ||val == 'U'||val == 'V')
				ans+="8";
			else if(val == 'W' ||val == 'X'||val == 'Y' || val == 'X')
				ans+="9";

			else
				ans+=val;

			// Condtion statments to add formatting//

			if(count == 2)
				ans+=")";
			else if(count == 5)
				ans+= "-";

		}

	System.out.println(ans); // prints the output


	}
}