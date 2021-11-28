/*

Create a basic Java program to implement Java I/O operations

1) Create variable of type int, float, double, boolean, char

2) Take input of all the variables 

3) display all the values on the console

Use Scanner Object in order to perform input operations. {Scanner class : is used to take input and is present in java.util package , objects and package and other topics will be covered in depth in coming modules}

*/

import java.util.*;

public class javaiocoding{
	public static void main(String[] args) {
		int num1;
		float num2;
		char character;
		boolean bool;
		String str;
		double num3;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer value: ");
			num1 = in.nextInt();
		System.out.println("Enter a floating value: ");
			num2 = in.nextFloat();
		System.out.println("Enter a character: ");
			character = in.next().charAt(0);
		System.out.println("Enter a boolean value: ");
			bool = in.nextBoolean();
		System.out.println("Enter a string: ");
			str = in.next();
		System.out.println("Enter a double value: ");
			num3 = in.nextDouble();

		System.out.println("Integer value is: "+num1);
		System.out.println("Floating number is: "+num2);
		System.out.println("Character is: "+character);
		System.out.println("Boolean value is: "+bool);
		System.out.println("String entered is: "+str);
		System.out.println("Double value is: "+num3);
	}
}