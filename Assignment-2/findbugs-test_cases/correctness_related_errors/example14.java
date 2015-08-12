/*I am trying to generate the following kind of messsage*/
/*Suppoe, this program finds prime less than 10000 based upon index and if we we enter -1 as an Index then the program terminates*/
import java.io.*;
class MainsClass
{
	static int primes[]=new int[5000];
	static boolean primemask[]=new boolean[10001];
	static int index;
	public static void sieve()
	{
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
	public static void main(String args[])throws IOException,Exception
	{
		sieve();
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int i;
		while(true)
		{
			i=Integer.parseInt(z.readLine());
			if(i==-1)
			{
				//oops forgot to apply break now the loop never terminates
			}
			else
			{
				if(i>=index)
				{
					throw new RuntimeException("The index is not in range");
				}
				else
				{
					System.out.println(primes[i]);
				}
			}
		}
	}
}
