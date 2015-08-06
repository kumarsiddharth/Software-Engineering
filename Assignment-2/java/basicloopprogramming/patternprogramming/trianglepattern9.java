import java.io.BufferedReader;
import java.io.InputStreamReader;
class Mainsclass
{
	public static void main(String args[])throws Exception
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int N;
		char ch;
		System.out.print("Enter N:");
		N=Integer.parseInt(z.readLine());
		for(int i=1;i<=N;i++)
		{
			for(int k=N-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			ch='A';
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}	
/* It generates the following pattern:
    A
   ABC
  ABCDE
 ABCDEFG
ABCDEFGHI
when n=5
   
*/

