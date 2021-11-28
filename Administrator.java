import java.util.Scanner;
import java.util.Random;

class Employee{
	String firstName, lastName;
	String option;
	Employee(String firstName, String lastName){
		System.out.println("Dear "+firstName+" your generated credentials are as follows: ");
	}
	void credentialService(int x){
		switch(x){
			case 1: option = "@tech.abc.com";
			break;
			case 2: option = "@admin.abc.com";
			break;
			case 3: option = "@hr.abc.com";
			break;
			case 4: option = "@legal.abc.com";
			break;
			/*default: System.out.println("Invalid Option!");
			System.exit(0);*/
		}
		System.out.print(option);
	}
	void generateEmailAddress(String firstName, String lastName){
		System.out.print("Your email address is: "+firstName+lastName);
	}
	
	void generatePassword(){
		int lenght = 6;
		System.out.println(password_trial(lenght));
	}
	static char[] password_trial(int len){
		System.out.print("\nYour password is: ");
		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=+-/.?<>)";
		String values = Capital_chars+Small_chars+numbers+symbols;
		Random rndm_method = new Random();
		char[] password = new char[len];
		for (int i = 0; i < len; i++){
			password[i]=values.charAt(rndm_method.nextInt(values.length()));
		}
		return password;
	}
	
	/*void showCredentials(){
		System.out.println("Your email address is: "+firstName+lastName+"@"+x+"abc.com");
	}*/
}

public class Administrator{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String empName1 = in.next();
		System.out.println("Please enter your last name: ");
		String empName2 = in.next();
		System.out.println("Various department options are: ");
		System.out.println("1: Technical\n2: Admin\n3: Human Resources\n4: Legal");
		System.out.println("Please select one: ");
		int a = in.nextInt();
		Employee emp = new Employee(empName1,empName2);
		//generateEmailAddress ge = new generateEmailAddress(empName1,empName2);
		emp.generateEmailAddress(empName1,empName2);
		emp.credentialService(a);
		emp.generatePassword();
	}
}
