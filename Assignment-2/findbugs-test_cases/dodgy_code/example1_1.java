/*I am trying to generate the following kind of error
Class is final but declares protected field (CI_CONFUSED_INHERITANCE)
This class is declared to be final, but declares fields to be protected. Since the class is final, it can not be derived from, and the use of protected is confusing. The access modifier for the field should be changed to private or public to represent the true use for the field. 
*/
import java.io.*;
class  Person
{
	protected String name;
	protected String panNumber;
	protected String gender;
	Person()
	{
		name=null;	
		panNumber=null;
		gender=null;
	}
	Person(String name, String panNumber, String gender)
	{
		this.name=name;
		this.panNumber=null;
		this.gender=gender;
	}
	void input()throws IOException
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the name:");
		name=z.readLine();
		System.out.print("Enter the pannumber:");
		panNumber=z.readLine();
		System.out.print("Enter the gender:");
		gender=z.readLine();
	}
}
class BankEmployee extends Person
{
	protected int employeeNumber;
	protected double salary;
	BankEmployee()
	{
		super();
		employeeNumber=0;
		salary=0;
	}
	BankEmployee(String name, String panNumber, String gender, int employeeNumber, double salary)
	{
		super(name,panNumber,gender);
		this.employeeNumber=employeeNumber;
		this.salary=salary;
	}
	void input()throws IOException
	{
		super.input();//because the method actually overrides super class method 
		//so, this is the only way we could use the superclass's input
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the employeeNumber:");
		employeeNumber=Integer.parseInt(z.readLine());
		System.out.print("Enter the salary:");
		salary=Double.parseDouble(z.readLine());
	}
}
final class BankOfficer extends BankEmployee
{
	protected String officerRank;
	BankOfficer()
	{
		super();
	}	
	BankOfficer(String name, String panNumber, String gender, int employeeNumber, double salary,String officerRank)
	{
		super(name,panNumber,gender,employeeNumber,salary);
		this.officerRank=officerRank;
	}
	void input()throws IOException
	{
		super.input();
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enters the officerrank:");
		officerRank=z.readLine();
	}
}
class MainsClass
{
	public static void main(String args[])throws IOException
	{
		BankOfficer officer1=new BankOfficer();
		officer1.input();
	}
}

