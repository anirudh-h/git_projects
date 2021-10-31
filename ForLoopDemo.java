	public class ForLoopDemo{
		public static void main(String[] args) {
			System.out.println("Regular for loop:");
			for (int i=1; i<=10; i++){
				System.out.println(i);
			}
			System.out.println("Using For-Each loop:");
			char arr[] = {'a', 'b', 'c', 'd', 'e'};
			for (char x : arr){
				System.out.println(x);
			}
			System.out.println("For loop coding quiz output:");
			for (int a=1; a<=10; a=a+2){
				System.out.println(a);
			}
		}
	}