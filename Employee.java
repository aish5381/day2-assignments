

public class Employee{
	  
       
	//public static double pf = 0.10*monthlyBasic or 6500 whichever is lower.
	//public static double ESIC = 4.75*monthlyBasic if monthly basic <= 5000
	//professional tax: if monthly gross <= 10000 then Rs 50, else Rs 100
	
		int empID;
		String empName;
		double monthlyBasic;
		public static int medicalAllowance=1250;
		public static int conveyanceAllowance = 800;

				

	public double getAnnualBasic(){
               return 12 * monthlyBasic;
	}

	public double getMonthlyGrossSalary(){
		double hra=0.5*monthlyBasic;
               return monthlyBasic + hra + medicalAllowance + conveyanceAllowance;
	}

	public double getAnnualGrossSalary(){
               return 12 * (getMonthlyGrossSalary(monthlyBasic));
	}


	public double getMonthlyDeductions()
	{
		double pf=0.10*monthlyBasic;
		double esic;
		double professionalTax;
		if(pf<=65000)
		{
			pf=pf;
		}
		else if(pf>65000)
		{
			pf=6500;
		}
		
		else if(monthlyBasic<=5000)
		{
			esic=4.75*monthlyBasic;
		}
		else if(monthlyBasic>5000)
		{
			esic=0;
		}
		
		//else if((getMonthlyGrossSalary(double monthlyBasic))<=10000)
		//{
			//professionalTax=50;
		//}
		else
		{
			professionalTax=100;
		}
			
		return pf + esic + profTax;
	}

}