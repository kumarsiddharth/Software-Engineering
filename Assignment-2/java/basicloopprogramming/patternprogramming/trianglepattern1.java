import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*Note that IOexception is a class under java.io package and deals with input output exception
and there is another Exception java.lang.Exception. Now, java.lang package is automatically included to all java programs 
and java.lang.Exception deals with other exceptions like IndexOutOfBoundsException (when you are addressing array indices which are beyond aarray limit , ArithmeticException (divided by zero)
/*Or, we could simply write as import java.io.*;
this would include all the classes of java.io package*/
public class trianglepattern1
{
	public static void main(String args[]) throws IOException,Exception//string args[] part is for command line argument
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter n:");
		int n;
		n=Integer.parseInt(z.readLine());
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
										
		

