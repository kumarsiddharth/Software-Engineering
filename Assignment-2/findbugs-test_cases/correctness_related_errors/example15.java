/*I am trying to generate the following type of error
RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
Method is called with array parameter and length parameter, but the length is out of bounds. This will result in IndexOutOfBoundsException at runtime. */
/*This program performs linear search*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class MainsClass
{
	static int linearSearch(int numberContainer,int n,int elementToSearch)/*returns position in the array if found, otherwise, return -1*/
	{
		for(int i=0;i<n;i++)
		{
			if(numberContainer[i]==elementToSearch)
			{
				return i;
			}
		}
		return -1;
	}	
	public static void main(String args[])throws IOException,Exception
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int n,elementToSearch;
		System.out.print("Enter the number of elements in the array:");//max limit 1000
		n=Integer.parseInt(z.readLine());
		int numberContainer[]=new int[n];
		for(int i=0;i<n;i++)
		{
			numberContainer[i]=Integer.parseInt(z.readLine());
		}
		System.out.print("Enter the element to search:");
		elementToSearch=Integer.parseInt(z.readLine());
		int result=linearSearch(numberContainer,n+4,elementToSearch);
		if(result==-1)
		{
			System.out.println("The element is not found in the array");
		}
		else
		{
			System.out.println("The element is found at the position="+result);
		}
	}
}	
