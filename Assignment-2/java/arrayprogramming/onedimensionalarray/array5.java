import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class MainsClass
{
	public static void main(String args[])throws IOException,Exception
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int n,currentElement,currentElementCount;
		boolean alreadyFoundFlag;
		System.out.print("Enter the number of elements:");
		n=Integer.parseInt(z.readLine());
		int array[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<array.length;i++)
		{
			array[i]=Integer.parseInt(z.readLine());
		}
		for(int i=0;i<array.length;i++)
		{
			alreadyFoundFlag=false;
			currentElementCount=0;
			for(int k=0;k<i;k++)
			{
				if(array[k]==array[i])
				{
					alreadyFoundFlag=true;
					break;
				}
			}
			if(alreadyFoundFlag==false)
			{
				currentElementCount++;//for array[i]
				for(int j=i+1;j<array.length;j++)
				{
					if(array[i]==array[j])
					{
						currentElementCount++;
					}
				}
				System.out.println("Element="+array[i]+"count="+currentElementCount);
			}
		}
	}
}	
