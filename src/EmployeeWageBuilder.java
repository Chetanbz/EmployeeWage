import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmployeeWageBuilder {
	Map<String,EmployeeWage> empWageCompany = new HashMap<String,EmployeeWage>();

	public static void main(String[] args) {
		 Map<String,Integer> empWageCompany = new HashMap<String,Integer>();
		 List<EmployeeWage>  emp = new ArrayList<EmployeeWage>();
		 Map<String,List> daily = new HashMap<String,List>();
		while(true) {
			System.out.println("Do you wish to add Wage for Employee for Company ");
			System.out.println("Press 1 Add new EmployeeWage for new Company \n Press 2 Get EmployeeWage of Company \n Press 0 Exit ");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			if (option == 0) {
				break;
			}
			else if(option ==2){
				System.out.println(" Provide name of company whose wage wants to get");
				String name = sc.next();
				System.out.println(empWageCompany.get(name));
			
			}
			System.out.println(" Provide name of company");
			String name = sc.next();
			EmployeeWage empWage = new EmployeeWage();
			empWage.companyCriteria();
			empWageCompany.put(name,empWage.wageCalculator());
			daily.put(name,empWage.dailyWageCalculator());
			
		}
		System.out.println("Toatal EmployeeWage ");
		System.out.println(empWageCompany);
		System.out.println("Daily EmployeeWage of company  ");
		System.out.println(daily);

	}
}