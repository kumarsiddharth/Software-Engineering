/*We are trying to generate the follwoing error:
EC: equals(...) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
This method invokes the .equals(Object o) to compare two arrays, but the arrays of of incompatible types (e.g., String[] and StringBuffer[], or String[] and int[]). They will never be equal. In addition, when equals(...) is used to compare arrays it only checks to see if they are the same array, and ignores the contents of the arrays. */
import java.io.*;
import java.util.*;
class MainsClass
{
	public static void main(String args[])throws IOException, Exception
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.print("Enter the number of elements in tha array:");
		n=Integer.parseInt(z.readLine());
		String stringInput[]=new String[n];
		int integerInput[]=new int[n];
		for(int i=0;i<n;i++)
		{
			stringInput[i]=z.readLine();
			integerInput[i]=Integer.parseInt(stringInput[i]);
		}
		if(stringInput.equals(integerInput)==true)
		{
			System.out.println("Both arrays are same");
		}
		else
		{	
			System.out.println("Both arrays are different");
		}		
	}
}	
		
