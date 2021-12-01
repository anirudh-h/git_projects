//Super department
class SuperDepartment{
	public String departmentName() {
		return "Super Department";
	}
	public String getTodaysWork() {
		return "No Work as of now";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}
}

//Admin deparment extends the Super department class 
class AdminDepartment extends SuperDepartment{
	public String departmentName(){
		return "Welcome to Admin department";
	}
	public String getTodaysWork(){
		return "Complete your documents Submission";
	}
	public String getWorkDeadline(){
		return "Complete by EOD";
	}
	void SuperDepartment(){
		System.out.println(isTodayAHoliday());
	}	
	void expectedOutput(){
		System.out.println(departmentName()+"\n"+getTodaysWork());
		System.out.println(getWorkDeadline()+"\n"+isTodayAHoliday());
	}
} 

//HR Department extends the Super department class
class HrDepartment extends SuperDepartment{
	public String departmentName(){
		return "Welcome to HR Department";
	}
	public String getTodaysWork(){
		return "Fill todays timesheet and mark your attendance";
	}
	public String doActivity(){
		return "Team lunch";
	}
	public void HrDepartment(){
		AdminDepartment admin = new AdminDepartment();
		System.out.println(admin.getWorkDeadline());
		SuperDepartment sup = new SuperDepartment();
		System.out.println(sup.isTodayAHoliday());
	}
	void expectedOutput(){
		System.out.println("\n"+departmentName()+"\n"+getTodaysWork());
		System.out.println(doActivity()+"\n"+getWorkDeadline()+"\n"+isTodayAHoliday());
	}
}

//Tech Department extends the Super department class
class TechDepartment extends SuperDepartment{
	public String departmentName(){
		return "Welcome to Tech department";
	}
	public String getTodaysWork(){
		return "Complete coding of module 1";
	}
	void TechDepartment(){
		AdminDepartment admin = new AdminDepartment();
		System.out.println(admin.getWorkDeadline());
		SuperDepartment sup = new SuperDepartment();
		System.out.println(sup.isTodayAHoliday());
	}
	public String getTechStackInformation(){
		return "Core Java";
	}
	void expectedOutput(){
		System.out.println("\n"+departmentName()+"\n"+getTodaysWork());
		System.out.println(getWorkDeadline()+"\n"+getTechStackInformation()+"\n"+isTodayAHoliday());
	}
}

//Driver or Main class calling objects of Admin, HR and Tech deparments
public class AssignmentOne{
	public static void main(String[] args) {
		AdminDepartment ad = new AdminDepartment();
		ad.expectedOutput();
		HrDepartment hr = new HrDepartment();
		hr.expectedOutput();
		TechDepartment td = new TechDepartment();
		td.expectedOutput();
	}
}