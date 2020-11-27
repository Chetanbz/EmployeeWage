import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeWage {
	static int  isPartTime = 1;
	static int isFullTime = 2 ;
	static int empRateHrs ;   // limit is set reference purpose
	static int maxDay  ;   // limit is set for reference purpose
	static int maxHrsMonth ; // limit is set for reffference purpose
	static int EmpTotalWage = 0;

	
	

	public static void main(String[] args) {
		System.out.println("provide Company policy on wage");
		companyCriteria();
		System.out.println("Welcome Employee");
		 EmpTotalWage = wageCalculator();
		
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
	
	public static List<Integer> dailyWageCalculator() {
		List<Integer>  daily = new ArrayList<Integer>();
		int EmpTotalHrs = 0;
		int EmpTotalwage =0;
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
			int num = empHrs*empRateHrs;
			daily.add(num);
			//System.out.println("Day# : " + day + " " + "Emp Hrs: " + empHrs );
			if (EmpTotalHrs > maxHrsMonth) {
			EmpTotalHrs = maxHrsMonth;
				break;
			}
		}
		EmpTotalwage = EmpTotalHrs*empRateHrs;
		System.out.println("Total Emp Wage :" + EmpTotalwage);
		return daily;
	}
	
	public static int wageCalculator() {
		List<Integer>  daily = dailyWageCalculator();
		int EmpTotalHrs = 0;
		int EmpTotalwage =0;
		for (int i :daily) {
			EmpTotalHrs +=i;
		}
		if (EmpTotalHrs > maxHrsMonth) {
			EmpTotalHrs = maxHrsMonth;
			}
		EmpTotalwage = EmpTotalHrs*empRateHrs;
		return EmpTotalwage;
	}
	
	public String toString() {
		return "Total wage for company : " + EmpTotalWage ;
	}

}
