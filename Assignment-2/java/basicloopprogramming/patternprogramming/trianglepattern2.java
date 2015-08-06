import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main
{
	public static void main(String args[])throws Exception
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int N;
		System.out.print("Enter N:");
		N=Integer.parseInt(z.readLine());
		for(int i=1;i<=N;i++)
		{
			for(int k=N-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}	
/* It generates the following pattern:
    1
   123
  12345
 1234567
123456789
*/

