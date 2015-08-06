/*Expected pattern
A      A
AB    BA
ABC  CBA
ABCDDCBA
when n=4
*/
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
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)('A'-1+j));
			}
			for(int k=1;k<=2*(n-i);k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)('A'-1+j));
			}
			System.out.println();
		}
	}
}			
