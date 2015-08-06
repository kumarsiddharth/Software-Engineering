/*This will find the sum of the series
2+4+6+8...upto n elements
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Mainsclass
{
	public static void main(String args[])throws IOException,Exception
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int N,sum=0;
		System.out.print("Enter n:");
		N=Integer.parseInt(z.readLine());
		for(int count=1,cur_term=2;count<=N;count++,cur_term+=2)
		{
			sum+=cur_term;
		}
		System.out.println("The sum of the series is:"+sum);
	}
}
