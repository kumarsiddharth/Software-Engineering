/*I am trying to produce the following type of message or error whatever you say
Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
This code tries to limit the value bounds using the construct like Math.min(0, Math.max(100, value)). However the order of the constants is incorrect: it should be Math.min(100, Math.max(0, value)). As the result this code always produces the same result (or NaN if the value is NaN).*/
import java.io.*;
class MainsClass
{
	public static int maxThree(int a,int b,int c)
	{
		return Math.max(a,Math.min(b,c));
	}
	public static int minThree(int a,int b,int c)
	{
		return Math.min(a,Math.max(b,c));
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int a,b,c;
		System.out.print("Enter a:");
		a=Integer.parseInt(z.readLine());
		System.out.print("Enter b:");
		b=Integer.parseInt(z.readLine());
		System.out.print("Enter c:");
		c=Integer.parseInt(z.readLine());	
		int maxThreeValue=maxThree(a,b,c);
		int minThreeValue=minThree(a,b,c);
		System.out.println("Maximum of three values:"+maxThreeValue);
		System.out.println("Minimum of three values:"+minThreeValue);
	}
}
