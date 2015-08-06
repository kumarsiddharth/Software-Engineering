/*This prints the sum of the following series
Add the series 1+3+...+(upto the odd number which is less than n)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Mainsclass
{
	public static void main(String args[])throws IOException,Exception
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int n,sum=0;
		System.out.print("Enter n:");
		n=Integer.parseInt(z.readLine());
		for(int i=1;i<=n;i+=2)
		{
			sum+=i;
		}
		System.out.println("The sum of the series is="+sum);
	}
}
		
