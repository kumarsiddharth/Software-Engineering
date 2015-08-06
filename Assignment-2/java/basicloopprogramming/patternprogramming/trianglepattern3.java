import java.io.BufferedReader;
import java.io.InputStreamReader;
class Mainsclass
//note than normal class definition allows to run your program by doing java name where name=the name of the class which contains main
//but if we define the main containing class public then the program name and the main containing class name must be same
{
	public static void main(String args[])throws Exception
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.print("Enter n:");
		n=Integer.parseInt(z.readLine());
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}		
			System.out.println();
		}
	}
}
/*
This would generate the following: if n is entered as 4
   1 
  1 2 
 1 2 3 
1 2 3 4 
*/
