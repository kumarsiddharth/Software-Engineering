/*Here, we we calculate the same series
(1)+(1+2)+(1+2+3)+(1+2+3+4)+....sum upto nth series*/
import java.io.*;
class Mainsclass
{
	public static void main(String args[])throws IOException
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int n,localsum=0,globalsum=0;
		System.out.print("Enter n:");
		n=Integer.parseInt(z.readLine());
		for(int i=1;i<=n;i++)
		{
			localsum+=i;
			globalsum+=localsum;
		}
		System.out.println("The sum of the series is:"+globalsum);
	}
}

