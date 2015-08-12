/*I am trying to generate the following type of error:
ICAST: Result of integer multiplication cast to long (ICAST_INTEGER_MULTIPLY_CAST_TO_LONG)

This code performs integer multiply and then converts the result to a long, as in:

    long convertDaysToMilliseconds(int days) { return 1000*3600*24*days; }

If the multiplication is done using long arithmetic, you can avoid the possibility that the result will overflow. For example, you could fix the above code to:

    long convertDaysToMilliseconds(int days) { return 1000L*3600*24*days; }

or

    static final long MILLISECONDS_PER_DAY = 24L*3600*1000;
    long convertDaysToMilliseconds(int days) { return days * MILLISECONDS_PER_DAY; }
*/
import java.io.*;
class MainsClass
{
	static long convertDaysToMilliseconds(int days) 
	{ 
		return 1000*3600*24*days; 
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int noOfDays;
		long noOfMilliSeconds;
		System.out.print("Enter the no of days:");
		noOfDays=Integer.parseInt(z.readLine());
		noOfMilliSeconds=convertDaysToMilliseconds(noOfDays);
		System.out.println("The no of milli seconds:"+noOfMilliSeconds);
	}
}
