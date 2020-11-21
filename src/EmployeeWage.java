
public class EmployeeWage {

	public static void main(String[] args) {
System.out.println("Welcome Employee");
		
		int isPartTime = 1;
		int isFullTime = 2 ;
		int empCheck = (int)Math.floor(Math.random()*10)%3;
		int empRateHrs = 20;
		int empHrs;
		int empWage;
		//System.out.println(empCheck);
		
		if ( empCheck == isFullTime){
			empHrs = 8;
			}
		else if (empCheck == isPartTime){
			empHrs = 4;
			}
		else {
			empHrs =0;
		}
		empWage = empHrs*empRateHrs;
		System.out.println("Emp Wage : " + empWage);
	}

}
