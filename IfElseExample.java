/*

Write a program in java to check whether the given number is an even number or not using an "if else statement". 

Test Cases

Test Case 1

     Input

     78

    Output

  Number is even

 Test Case 2

     Input

      63

   Output

  Number is odd

Hint : Use modulus operator to determine whether no is even or odd.

*/

import java.util.Scanner;

class IfElseExample{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Please input a value to check for odd or even: ");
		int value = in.nextInt();
		value = value%2;

		if(value==0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}
}