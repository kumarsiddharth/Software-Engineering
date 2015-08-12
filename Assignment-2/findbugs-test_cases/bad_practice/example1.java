//bitwise operation: if one of the two operators has negative value then it is bad practice
import java.io.*;
class Mainsclass
{
	public static void main(String args[])throws IOException
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int n,m;
		System.out.print("Enter n:");
		n=Integer.parseInt(z.readLine());
		System.out.print("Enter m:");
		m=Integer.parseInt(z.readLine());
		int result=n&m;
		if(result>0)
		{
			System.out.println("m and n have at least one common bit set");
		}
		else
		{
			System.out.println("m and n have no common bits set");
		}
	}
}
