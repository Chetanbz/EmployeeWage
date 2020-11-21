
public class EmployeeWage {

	public static void main(String[] args) {
        System.out.println("Welcome Employee");
		
		int isFullTime = 1;
		int empCheck = (int)Math.floor(Math.random()*10)%2;
		int empRateHrs = 20;
		int empHrs;
		int empWage;
		
		if ( empCheck == isFullTime){
			empHrs = 8;
			}
			else{
			empHrs = 0;
			}
		empWage = empHrs*empRateHrs;
		System.out.println("Emp Wage: " + empWage);

	}

}
