public class TypeCastExample{
	public static void main(String[] args){

		//Implicit type cast
		short a = 455;
		int b;
		b = a;
		System.out.println("Value is: "+b);

		//Explicit type cast
		short x;
		int y = 900;
		x = (short) y;
		System.out.println("Value is: "+x);
	}
}