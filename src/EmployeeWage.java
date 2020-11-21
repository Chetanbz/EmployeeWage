
public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome Employee");
		
		int isPartTime = 1;
		int isFullTime = 2 ;
		int empRateHrs = 20;
		int maxDay    = 20;
		int empHrs;
		int EmpTotalwage=0;
		int EmpTotalHrs = 0;
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
