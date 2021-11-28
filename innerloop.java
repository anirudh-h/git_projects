/*
Write a program in java to print the following pattern (Hint : Use nested for loop)

 

*

**

***

****

*****
*/

public class innerloop{
	public static void main(String[] args) {
		for (int a=0; a<5; a++){
			for (int i=0;i<=a;i++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}