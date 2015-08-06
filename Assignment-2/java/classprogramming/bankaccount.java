/*Design a class to represnt a bank account. Tnclude the following members:
Data members:
	Name of the depositors
	Account Number
	Type of account
	Balance amount in the account
Method:
	To assign initial values
	To deposit an amount
	To withdraw an amount after checking balances
	To display the name and balance
*/
import java.io.*;
import java.util.*;
abstract class BankAccount
{
	private String name;
	private String  accountNumber;
	private String accountType;
	private double balance;
	double withdrawMoney(double amount);
	void displayDetails();
}
class FixedDepositBankAccount extends BankAccount
{
	
}
class CurrentBankAccount extends BankAccount
{
	private double minimumBalance;
	
}
class BankAccountHolder
{
	private String name;
	private int count;
	private Map accountDetails<String,int>;
}
class associateOperations 
{
	private static accountHolderCount;
	private BankAcountHolder bankAccountHolderInfo[1000];
	private BankAccount bankAccountInfo[1000];
	private  HashMap bankAccountHolderIndex <String,int>=new HashMap <String,int> ();
	void createAccount() throws IOException, Exception
	{
		String name;
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Name:");
		name=z.readLine();
		int index=int)bankAccountHolderIndex.get(name);
		if(index==0)
		{
			accountholdercount++;
			
			
		
		
				
