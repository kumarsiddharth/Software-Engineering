/*bad practice we should carefully invoke System.exit() from a method*/
import java.io.*;
class MainsClass
{
	static int primes[];
	static boolean primemask[];
	static int index;
	static void sieve()throws Exception
	{
		primemask=new boolean[10001];
		primes=new int[5001];
		index=0;
		for(int i=0;i<=10000;i++)
		{
			primemask[i]=false;
		}
		for(int i=3;i<=101;i+=2)
		{
			if(!primemask[i])
			{
				for(int j=i*i,k=i<<1;j<=10000;j+=k)
				{
					primemask[j]=true;
				}
			}
		}
		primes[index++]=2;
		for(int i=3;i<=10000;i+=2)
		{
			if(!primemask[i])
			{
				primes[index++]=i;
			}
		}
	}		
	static int nextNumber(int i)
	{
		return primes[i]++;//useless increment
	}
	public static void main(String args[])throws IOException,Exception
	{
		sieve();
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int T,i;
		System.out.print("Enter the number of cases:");
		T=Integer.parseInt(z.readLine());
		for(int t=0;t<T;t++)
		{
			System.out.print("Enter the index:");
			i=Integer.parseInt(z.readLine());
			if(i>=index)
			{
				System.exit(0);//that is considered a bad practice
				/*we should throw an exception instead
				throw new RuntimeException("Asking for index out of range");
				*/
			}
			else
			{
				System.out.println(nextNumber(i));
			}
		}
	}
}
