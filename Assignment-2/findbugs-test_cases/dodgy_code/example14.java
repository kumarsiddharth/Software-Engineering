/*I am trying to generate the following error:
Self assignment of local variable (SA_LOCAL_SELF_ASSIGNMENT)
This method contains a self assignment of a local variable; e.g.

  public void foo() {
    int x = 3;
    x = x;
  }
*/
import java.io.*;
class MainsClass
{
	public static void main(String args[])throws IOException
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.print("Enter n:");
		n=Integer.parseInt(z.readLine());
		n=n;
		System.out.println("The value of n is:"+n);
	}
}
