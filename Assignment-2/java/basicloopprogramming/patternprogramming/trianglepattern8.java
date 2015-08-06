import java.io.BufferedReader;
import java.io.InputStreamReader;
/*Or, we could simply write as import java.io.*;
this would include all the classes of java.io package*/
class Mainsclass
{
	public static void main(String args[]) throws Exception//string args[] part is for command line argument
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter n:");
		int n;
		n=Integer.parseInt(z.readLine());
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)('A'-1+j)+" ");
			}
			System.out.println();
		}
	}
}
/*This would print the following pattern when n=5
A 
A B 
A B C 
A B C D 
A B C D E 
However, we could write the program like the following:
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Mainsclass
{
	public static void main(String args[]) throws Exception//string args[] part is for command line argument
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter n:");
		int n;
		char ch;
		n=Integer.parseInt(z.readLine());
		for(int i=1;i<=n;i++)
		{
			ch='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}									
*/		

