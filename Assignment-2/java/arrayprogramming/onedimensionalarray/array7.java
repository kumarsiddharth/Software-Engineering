import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class MainsClass
{
	public static void main(String args[])throws IOException,Exception
	{
		int n,elementToInsert,position;
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of elements of the array:");
		n=Integer.parseInt(z.readLine());
		int array[]=new int[n+1];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++)
		{
			array[i]=Integer.parseInt(z.readLine());
		}
		System.out.print("Enter the element to insert in the array:");
		elementToInsert=Integer.parseInt(z.readLine());
		System.out.print("Enter the position:");
		position=Integer.parseInt(z.readLine());
		for(int i=n-1;i>position;i--)
		{
			array[i+1]=array[i];
		}		
		array[position]=elementToInsert;
		System.out.println("Printing the modified array");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
}
	
