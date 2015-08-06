import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class MainsClass
{
	public static void main(String args[])throws IOException,Exception
	{
		int n,elementToDelete;
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of elements of the array:");
		n=Integer.parseInt(z.readLine());
		int array[]=new int[n];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++)
		{
			array[i]=Integer.parseInt(z.readLine());
		}
		System.out.print("Enter the element to delete from the array:");
		elementToDelete=Integer.parseInt(z.readLine());
		for(int i=0;i<n;i++)
		{
			if(array[i]==elementToDelete)
			{
				for(int k=i;k<n;k++)
				{
					x[k]=x[k+1];
				}
			}
			n--;
			i--;		
		}		
		System.out.println("Printing the modified array");
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
	}
}
	
