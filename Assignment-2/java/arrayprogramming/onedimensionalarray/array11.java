import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class StringOrdering
{
	static String names[]={"Madras","Delhi","Ahmedabad","Calcutta","Bombay"};
	public static void main(String args[])throws IOException	
	{
		int size=names.length;
		String temp=null;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(names[j].compareTo(names[i])<0)
				{
					//swap the strings
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		System.out.println("Displaying the strings in alphabetical order");
		for(int i=0;i<size;i++)
		{
			System.out.println(names[i]);
		}
	}
}
