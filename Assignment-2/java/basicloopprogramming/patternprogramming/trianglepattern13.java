import java.io.BufferedReader;
import java.io.InputStreamReader;
class Mainsclass
{
	public static void main(String args[])throws Exception
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.print("Enter n:");
		n=Integer.parseInt(z.readLine());
		char ch;
		for(int i=1;i<=n;i++)
		{
			ch='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			ch='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}		
	}
}
/*
This will print the following pattern when n=4
A
AB
ABC
ABCD
ABC
AB
A
*/
