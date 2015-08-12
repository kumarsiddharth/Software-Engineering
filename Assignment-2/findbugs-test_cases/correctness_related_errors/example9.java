/*obviosuly this contains error, like for big a andd b, integer range wil overflow to hold a+b etc*/
import java.io.*;
class MainsClass
{
	static long modval=1000000007L;
	static int add(int a,int b)
	{
		a+=b;
		if (a >=modval) //this will invoke the correctness message because an integer value is compared with long constant
		{
			a-=modval;
		}
 		return a;
	}
	static int sub(int a,int b)
	{
		if(a<b)
		{
			a+=modval;
		}		
		return a-b;
	}		
	static int mul(int a,int b) 
	{
		if(a>=modval)//this will invoke the correctness message because an integer value is compared with long constant
		{
			a-=modval;
		}
		if(b>=modval)//this will invoke the correctness message because an integer value is compared with long constant
		{
			b-=modval;
		}
 		int r = a*b-(int)((double)(a)*b/modval)*modval;
 		return r < 0 ? r +modval : r >= modval ? r -modval : r;
	}	
	public static void main(String args[])throws IOException, Exception
	{
		int a,b;
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a:");
		a=Integer.parseInt(z.readLine());
		System.out.println("Enter b:");
		b=Integer.parseInt(z.readLine());
		int value=add(a,b);
		System.out.println("The value of the addition:"+value);
	}			
}

