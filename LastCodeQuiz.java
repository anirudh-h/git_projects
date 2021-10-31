//Write a program to interchange two numbers without using a third variable.

//Hint: perform addition and subtraction and use the same variables to store result.

import java.util.*;

public class LastCodeQuiz{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter two value: ");
		int a = in.nextInt();
		int b = in.nextInt();

		/* 
			Take a as 2
			Take b as 5
			Logic is below
		*/
		a = a + b; 
		// a = 2 + 5 ==> 7
		b = a - b; 
		// b = 7 - 5 ==> 2
		a = a - b; 
		// a = 7 - 2 ==> 5

		System.out.println("Now the values are:\n"+a+"\n"+b);
	}
}