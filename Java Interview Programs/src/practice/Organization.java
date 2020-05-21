package practice;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

/*
Que: 1. Create organization class with instance variable as, name of Organization and Employee array. For organization 
		A add 10 Employees, for each employee track there employee id, name, age, experience.
	 2. Loop through the array and add employee to the organization. Once the organization employee builds filter 
	 	top 3 employee with highest experience.

*/
public class Organization {

	String organisationName;
	Employee[] employee;
	int highestEmpExp=0;
	
	Organization orgp[] = new Organization[1];
	
	public Organization(String cOrganizationName, Employee[] cEmployee) {
		
		this.organisationName=cOrganizationName;
		this.employee=cEmployee;
	}
	
	public void addAllEmployeesToOrganization(String organisation, Employee[] empArray)
	{
		System.out.println("Adding all Employees to the Organization "+organisation+": ");
		for(int i=0; i<empArray.length; i++)
		{
			System.out.println("OrgName:"+organisation+"   EmpID:"+empArray[i].empID+"    Name:"+empArray[i].empName+
					"    Age:"+empArray[i].age+"    Exp:"+empArray[i].empExp);
		
		}
	}
	
	public void displayTop_3_EmployeeInOrganisation(Employee[] top3Emp)
	{
		
		for(int i=0; i<top3Emp.length; i++)
		{
			if(top3Emp[i].empExp>highestEmpExp)
				highestEmpExp=top3Emp[i].empExp;
		}
		
		Employee.displaySpecificElement(this.organisationName, highestEmpExp, top3Emp);
	}
	
	
	public static void main(String[] args) {
		 
		Organization org = new Organization("A", new Employee[10]);
		org.employee[0]= new Employee(1, "Vaibhav R", 27, 4);
		org.employee[1]= new Employee(2, "Rahul M", 29,6);
		org.employee[2]= new Employee(3, "Rahul M2", 29,8);
		org.employee[3]= new Employee(4, "Rahul M3", 29,3);
		org.employee[4]= new Employee(5, "Rahul M4", 29,4);
		org.employee[5]= new Employee(6, "Rahul M5", 29,5);
		org.employee[6]= new Employee(7, "Rahul M6", 29,6);
		org.employee[7]= new Employee(8, "Rahul M7", 29,1);
		org.employee[8]= new Employee(9, "Rahul M8", 29,7);
		org.employee[9]= new Employee(10, "Rahul M9", 29,0);
		
		
		//Add Employees to the Organization
		org.addAllEmployeesToOrganization(org.organisationName,org.employee);
		//Display top 3 employee with highest Experience
		org.displayTop_3_EmployeeInOrganisation(org.employee);
		
	}

}

class Employee{
	
	int empID, age, empExp;
	String empName;
	static int counter=0;
	Employee(int cEmpID, String cEmpName, int cAge, int cEmpExp){
		
		this.empID=cEmpID;
		this.empName=cEmpName;
		this.age=cAge;
		this.empExp=cEmpExp;
	}
	
	public int getEmpID()
	{
		return this.empID;
	}
	
	public String getEmpName()
	{
		return this.empName;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public int getEmpExperieance()
	{
		return this.empExp;
	}
	
	public static void displaySpecificElement(String orgName,int highEmpExp,Employee[] empArray)
	{
		System.out.println();
		System.out.println("Top 3 Employee with highest Experiance: ");
		while(highEmpExp>0)
		{
		for(int i=0; i<empArray.length; i++)
		{
			if((highEmpExp==empArray[i].empExp)& (counter<3))
			{
				System.out.println("OrgName: "+orgName+"   EmpID:"+empArray[i].empID+"   Name:"+empArray[i].empName+"   Age:"+empArray[i].age+"   Exp:"+empArray[i].empExp);
				++counter;
			}
		}
		--highEmpExp;
		}
		
	}
		
}

