//Check whether the given number is odd or even using ternary operator

/*
import java.io.*;
import java.util.Scanner;
public class FourthJavaCode{
	public static void main(String[] args)throws Exception{
		Scanner in = new Scanner(System.in);  
		
		int a;
		int res;
		System.out.println("Enter a value: ");
		a=in.nextInt();
		res = a%2;
		if(res==0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}
}
*/
public class FourthJavaCode{
	public static void main(String[] args){
		int x = 4;
		String res = (x%2 == 0)? "even" : "odd";
		System.out.println(res);
	}
}