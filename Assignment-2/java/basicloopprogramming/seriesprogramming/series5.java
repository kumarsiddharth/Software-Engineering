/*This will find the sum of the series
1+4+7+...upto n elements
Note that:
1+4+7+...upto n elements
and
1+4+7 upto n
is different*/
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
		for(int count=1,cur_term=1;count<=N;count++,cur_term+=3)
		{
			sum+=cur_term;
		}
		System.out.println("The sum of the series is:"+sum);
	}
}
