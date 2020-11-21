
public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome Employee");
		
		int isPartTime = 1;
		int isFullTime = 2 ;
		int empRateHrs = 20;
		int maxDay    = 20;
		int empHrs;
		int empWage;
		int EmpTotalwage=0;
		//Employee can be parttime or fulltime on alternate days
		
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
		empWage = empHrs*empRateHrs;
		System.out.println("Emp Wage : " + empWage);
		EmpTotalwage += empWage;
		}
		System.out.println("Total Emp Wage :" + EmpTotalwage);

	}

}
