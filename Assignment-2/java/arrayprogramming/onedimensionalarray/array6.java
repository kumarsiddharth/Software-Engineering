/*This will again determine the frequencies of all elements in the array like last program array5.java but this will use the Map interface 
. To be precise, this will use HashMap (the best Map Implementation)*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
class MainsClass
{
	public static void main(String args[])throws IOException, Exception
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.print("Enter the number of elements in the array:");
		n=Integer.parseInt(z.readLine());
		int array[]=new int[n];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<array.length;i++)
		{
			array[i]=Integer.parseInt(z.readLine());
		}
		Map <Integer,Integer>frequencyTable=new HashMap <Integer,Integer>();
		for(int i=0;i<array.length;i++)
		{
			if(frequencyTable.get(array[i])==null)
			{
				frequencyTable.put(array[i],1);
			}
			else
			{
				frequencyTable.put(array[i],frequencyTable.get(array[i])+1);	
			}
		}
		for (Map.Entry <Integer,Integer> entry : frequencyTable.entrySet()) 
		{
			System.out.println("Value="+entry.getKey() +" Count=" + entry.getValue());
		}
	}
}		

