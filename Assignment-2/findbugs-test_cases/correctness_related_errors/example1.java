/*I am trying to generate this kind of thing
BIT: Check to see if ((...) & 0) == 0 (BIT_AND_ZZ)
This method compares an expression of the form (e & 0) to 0, which will always compare equal. This may indicate a logic error or typo.
i.e. the when if condition has no meaning:always truee kind of thing
however, it is not possible to generate this exact error with bitwise operator. But, we can get this*/
import java.io.*;
class MainsClass
{
	public static void main(String args[])throws IOException
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int n,value;
		n=Integer.parseInt(z.readLine());
		if(n>=0)
		{
			value=n;
		}
		else
		{
			value=0;
		}
	}
}
