import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class MainsClass
{
	public static void main(String args[])throws IOException
	{
		int min,max,n,sum=0;
		double average;
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of elements in the array:");
		n=Integer.parseInt(z.readLine());
		int array[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<array.length;i++)
		{		
			array[i]=Integer.parseInt(z.readLine());
		}
		min=Integer.MAX_VALUE;//static member of jaava.lang.Integer class
		max=Integer.MIN_VALUE;//static member of jaava.lang.Integer class
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
			if(array[i]>max)
			{
				max=array[i];
			}
			sum+=array[i];
		}
		average=(double)sum/n;
		System.out.println("Max element="+max);
		System.out.println("Min element="+min);
		System.out.println("Average value="+average);
	}
}
