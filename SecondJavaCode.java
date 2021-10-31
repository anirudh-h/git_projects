public class SecondJavaCode{
	public static void main(String[] args){
		
		//Declaration
		int a;
		float b;
		char c;
		boolean x;
		String y;
		double z;

		//Initialization
		a=1;
		b=25f;
		c='P';
		x=true;
		y="Hello! Welcome to the second Java program";
		z=200.5;

		//Output
		System.out.println("\n"+y+"\n");
		System.out.println("Values are:\n"+"Integer value is: "+a+"\n"+"Floating point value is: "+b+"\n"+"Character is: "+c+"\n"+"Double Value is: "+z);

		if(x==true){
			System.out.println("Boolean Value is: "+x);			
		}
		else{
			System.out.println("Boolean Value is: "+x);
		}
	}
}