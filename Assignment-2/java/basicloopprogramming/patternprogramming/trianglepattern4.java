import java.io.*;
class Mainsclass
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.print("Enter n:");
		n=Integer.parseInt(z.readLine());
		for(int i=n;i>=1;i--)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
/*This will print the following pattern if we enter n=5
12345
 1234
  123
   12
    1
*/
