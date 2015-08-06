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
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			ch='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
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
/*This would print the following thing:
    A 
   A B 
  A B C 
 A B C D 
A B C D E 
 A B C D 
  A B C 
   A B 
    A
when n=5 
*/
