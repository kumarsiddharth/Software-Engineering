/*I am trying to generate the following error*/
/*
Method uses the same code for two branches (DB_DUPLICATE_BRANCHES)
This method uses the same code to implement two branches of a conditional branch. Check to ensure that this isn't a coding mistake. */
import java.io.*;
class MainsClass
{
	public static void main(String args[])throws IOException
	{
		int n;
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter n:");
		n=Integer.parseInt(z.readLine());
		if(n%2==0)
		{
			System.out.println("It is even");
		}		
		else
		{
			System.out.println("It is even");
		}
	}
}
