import java.util.Scanner;

public class EmployeeMain{
			
		public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);      
		Employee e;

		System.out.println("Enter the employee Id");
		e.empID=scanner.nextInt();
		
		System.out.println("Enter the employee name");
		e.empName=scanner.next();
 
		System.out.println("Enter the basic salary");
		e.monthlyBasic=scanner.nextDouble();

		System.out.println("Annual Basic Salary is: "+e.getAnnualBasic());
		System.out.println("Monthly Gross Salary is: "+e.getMonthlyGrossSalary());
		System.out.println("Annual Gross Salary is: "+e.getAnnualGrossSalary());
		System.out.println("Monthly Deductions is: "+e.getMonthlyDeductions());
		

	}

}	