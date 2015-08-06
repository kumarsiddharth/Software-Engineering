import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class MainsClass
{
	static int lcm(int a,int b)
	{
		if(a==b)
		{
			return a;
		}
		else	
		{
			int max=a>b?a:b;
			int min=a<b?a:b;
			int count=1;
			while((max*count)%min!=0)
			{
				count++;
			}
			return max*count;
		}
		
	}
	public static void main(String args[])throws IOException, Exception
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.print("Enter n:");
		n=Integer.parseInt(z.readLine());
		int array[]=new int[n];
		System.out.println("Enter the numbers");
		for(int i=0;i<array.length;i++)
		{
			array[i]=Integer.parseInt(z.readLine());
		}
		int result=array[0];
		for(int i=1;i<array.length;i++)
		{
			result=lcm(result,array[i]);
		}
		System.out.println("The result is="+result);
	}
}
