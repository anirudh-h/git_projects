import java.util.*;

public class BreakDemo{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your desired number to identify whether it is present in the array: ");
		int target = in.nextInt();
		for (int i=0; i<5;i++){
			if (arr[i]==target) {
				System.out.println("Element was found! ");
				break;
			}
		}
	}
}