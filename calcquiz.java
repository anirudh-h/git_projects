import java.util.*;

public class calcquiz{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x=0;
		while (x<1){
			System.out.println("Enter two values to perform simple arithmetic operations:");
			int i = in.nextInt();
			int j = in.nextInt();
			System.out.println("For Addition press 1\nFor Subtraction press 2\nFor multiplication press 3\nFor Division press 4\nTo exit calculator press 5");
			int a = in.nextInt();
			switch(a){
				case 1: System.out.println(i+j); break;
				case 2: System.out.println(i-j); break;
				case 3: System.out.println(i*j); break;
				case 4: if (j==0){
					System.out.println("Number cannot be divided!");
				}
				else{
					System.out.println(i/j);
				} break;
				case 5: x=x+1; break;
				default: System.out.println("Invalid Option! Please try again!");
			}
		}
	}
}