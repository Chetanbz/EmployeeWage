
public class EmployeeWage {
	static int isPartTime = 1;
	static int isFullTime = 2 ;
	static final int empRateHrs = 20;
	static final int maxDay    = 20;
	static int empHrs =0 ;
	static int EmpTotalwage=0;
	static int EmpTotalHrs = 0;

	public static void main(String[] args) {
		System.out.println("Welcome Employee");
		wageCalculator();
		
	}
	
	
	public static void wageCalculator() {
		for (int day =1; day <= maxDay; day++) {
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
			if (EmpTotalHrs > 100) {
			EmpTotalHrs = 100;
				break;
			}
		}
		EmpTotalwage = EmpTotalHrs*empRateHrs;
		System.out.println("Total Emp Wage :" + EmpTotalwage);
	}

}
