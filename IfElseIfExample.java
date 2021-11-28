import java.util.*;

public class IfElseIfExample{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a value: ");
		int year = in.nextInt();

		if(year%400 == 0){
			System.out.println("Perfectly Leap Year");
		}
		else if(year%100 == 0){
			System.out.println("Not a leap year");
		}
		else if(year%4 == 0){
			System.out.println("Leap Year");
		}
		else{
			System.out.println("Non Leap Years");
		}
	}
}