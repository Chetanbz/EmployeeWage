
public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome Employee");
		
		int isPartTime = 1;
		int isFullTime = 2 ;
		int empCheck = (int)Math.floor(Math.random()*10)%3;
		int empRateHrs = 20;
		int empHrs = 0;
		int empWage;
		
		switch (empCheck) {
		case (1) :{
			empHrs = 4;
			break;
		}
		case (2) :{
			empHrs = 8;
			break;
		}
		case (3) :{
			empHrs = 0;
		}
			
		}
		empWage = empHrs*empRateHrs;
		System.out.println("Emp Wage : " + empWage);

	}

}
