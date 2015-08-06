/*This program performs linear search*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class MainsClass
{
	
	static int linearSearch(int numberContainer[],int elementToSearch)/*returns position in the array if found, otherwise, return -1*/
	{
		for(int i=0;i<numberContainer.length;i++)
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
		int numberContainer[]=new int[n];//this is static array
		for(int i=0;i<numberContainer.length;i++)
		{
			numberContainer[i]=Integer.parseInt(z.readLine());
		}
		System.out.print("Enter the element to search:");
		elementToSearch=Integer.parseInt(z.readLine());
		int result=linearSearch(numberContainer,elementToSearch);
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
