/*This prints the sum of the following series
1+2+3+..........+n
well, obviously there's a formula
to calculate the sum of first n numbers n(n+1)/2
But, suppose, you have to sum elements like 1+4+8+50+78 where no pattern is followed, then you need the loop
Besides this is for learning basic loop programming
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Mainsclass
{
	public static void main(String args[])throws IOException,Exception
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int n;//declaration
		int sum=0;//declaration with definition
		System.out.print("Enter n:");
		n=Integer.parseInt(z.readLine());
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("The sum of the series is="+sum);
	}
}
		
