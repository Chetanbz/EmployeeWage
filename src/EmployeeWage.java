import java.util.Scanner;

public class EmployeeWage {
	static int isPartTime = 1;
	static int isFullTime = 2 ;
	static int empRateHrs = 20;   // limit is set reference purpose
	static int maxDay    = 31;    // limit is set for reference purpose
	static int maxHrsMonth = 100; // limit is set for reffference purpose
	static int EmpTotalwage=0;
	static int EmpTotalHrs = 0;

	public static void main(String[] args) {
		System.out.println("provide Company policy on wage");
		companyCriteria();
		System.out.println("Welcome Employee");
		wageCalculator();
		
	}
	public static void companyCriteria() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide maximum working Hours in month");
		maxHrsMonth  = sc.nextInt();
		System.out.println("Please provide maximum working Days in month");
		maxDay      = sc.nextInt();
		System.out.println("Please provide Rate per Hours");
		empRateHrs = sc.nextInt();
		
	}
	
	
	public static void wageCalculator() {
		for (int day =1; day <= maxDay; day++) {
			int empHrs = 0;
			int empCheck = (int)Math.floor(Math.random()*10)%3;
			if ( empCheck == isFullTime){
				empHrs = 8;
			}
			else if (empCheck == isPartTime){
				empHrs = 4;
			}
			else {
				empHrs =0;
			}
			EmpTotalHrs += empHrs; 
			System.out.println("Day# : " + day + " " + "Emp Hrs: " + empHrs );
			if (EmpTotalHrs > maxHrsMonth) {
			EmpTotalHrs = maxHrsMonth;
				break;
			}
		}
		EmpTotalwage = EmpTotalHrs*empRateHrs;
		System.out.println("Total Emp Wage :" + EmpTotalwage);
	}

}
