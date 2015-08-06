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
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=n-2;i>=1;i--)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int  j=1;j<=2*i-1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}	 
/*the following pattern would be printed when n=5
    1
   123
  12345
 1234567
123456789
  12345
   123
    1
*/
