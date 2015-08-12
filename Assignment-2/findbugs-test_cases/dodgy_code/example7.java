/*I am trying to perform the following error*/
/*remainder modulo 1*/
import java.io.*;
class MainsClass
{
	public static void main(String args[])throws IOException
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));		
		int n;
		System.out.print("Enter n:");
		n=Integer.parseInt(z.readLine());
		if(n%1==0)//oops, I did a mistake
		{
			System.out.println("It is even");
		}		
		else
		{
			System.out.println("It is odd");	
		}
	}
}
