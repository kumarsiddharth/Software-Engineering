import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class MainsClass
{
	static int gcd(int a,int b)
	{
		if(a==0)
		{
			return b;
		}
		if(b==0)
		{
			return a;
		}
		int remainder=a%b;
		while(remainder!=0)
		{
			a=b;
			b=remainder;
			remainder=a%b;
		}
		return b;
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
			result=gcd(result,array[i]);
		}
		System.out.println("The result is="+result);
	}
}
