/*

Create a basic Switch case statement which will handle the following cases:

if number is 1 : it should display "neither prime nor composite"

if number is 2 : it should display "no is prime"

if number is 4 : it should display "no is composite"

*/

import java.util.*;

public class SwitchCoding{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter either 1 or 2 or 4");
		int num = in.nextInt();
		switch(num){
			case 1 : System.out.println("Neither prime nor composite"); break;
			case 2 : System.out.println("Number is prime"); break;
			case 4 : System.out.println("Number is composite"); break;
			default : System.out.println("Invalid number");
		}
	}
}