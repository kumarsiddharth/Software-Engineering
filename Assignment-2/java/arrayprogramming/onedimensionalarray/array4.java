import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class MainsClass
{
	static int binarySearch(int array[],int elementToSearch)
	{
		int down=0,up=array.length-1,mid;
		while(down<=up)
		{
			mid=(down+up)/2;
			if(array[mid]==elementToSearch)
			{
				return mid;
			}
			else if(array[mid]>elementToSearch)
			{
				up=mid-1;
			}
			else
			{
				down=mid+1;
			}
		}
		return -1;
	}
	public static void main(String args[])throws IOException,Exception
	{
		int n,elementToSearch;		
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of elements in the array:");
		n=Integer.parseInt(z.readLine());
		System.out.print("Enter the elements:");
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=Integer.parseInt(z.readLine());
		}
		System.out.print("Enter the element to search:");
		elementToSearch=Integer.parseInt(z.readLine());
		int position=binarySearch(array,elementToSearch);
		if(position==-1)
		{
			System.out.println("The element is not found");
		}
		else
		{
			System.out.println("The element is found at position="+position);
		}
	}	
}	
