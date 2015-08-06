import java.io.*;
class Mainsclass
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.print("Enter n:");
		n=Integer.parseInt(z.readLine());
		char ch;
		for(int i=n;i>=1;i--)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
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
/*This would print the following:
ABCDE
 ABCD
  ABC
   AB
    A
when n=5*/

