/*This will sum up the series:
(1)+(1+2)+(1+2+3)+(1+2+3+4)+...upto nth series
this can be easily done using nested loop*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Mainsclass
{
	public static void main(String args[])throws IOException
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int n,localsum,globalsum=0;//globalsum will store sum of all series
		System.out.print("Enter n:");
		n=Integer.parseInt(z.readLine());
		for(int i=1;i<=n;i++)//it will calculate sum of all series
		{
			localsum=0;//it will store the value of the ith series at ith instance
			for(int j=1;j<=i;j++)//it will calculate sum of ith series at ith instance
			{
				localsum+=j;
			}
			globalsum+=localsum;
		}
		System.out.println("The sum of the series:"+globalsum);
	}
}
		
