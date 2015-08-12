/*I am trying to generate the following type of error*/
/*Integral division result cast to double or float (ICAST_IDIV_CAST_TO_DOUBLE)

This code casts the result of an integral division (e.g., int or long division) operation to double or float. Doing division on integers truncates the result to the integer value closest to zero. The fact that the result was cast to double suggests that this precision should have been retained. What was probably meant was to cast one or both of the operands to double before performing the division. 
*/
/*Example:
Suppose, I am trying to generate the value 1/1+1/2+1/3+1/4+...+1/n
*/
import java.io.*;
class MainsClass
{
	public static void main(String args[])throws IOException
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int n;
		double sum=0;
		System.out.print("Enter n:"); 
		n=Integer.parseInt(z.readLine());
		for(int i=1;i<=n;i++)
		{
			sum+=1/i;
			//obiviously It will lead to generate the wrong value 
			//correct one would be sum+=1.0/i;
		}
		System.out.println("The sum is:"+sum);
	}
}
