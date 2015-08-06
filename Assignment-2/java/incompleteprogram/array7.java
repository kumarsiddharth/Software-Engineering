import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Mainsclass
{
	public static void main(String args[])throws IOException, Exception
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.print("Enter the number of elements in the array:");
		n=Integer.parseInt(z.readLine());
		int array=new int[n];
		for(int i=0;i<array.length;i++)
		{
			array[i]=Integer.parseInt(z.readLine());
		}
		while(true)
		{
			char ch;
			String tempChoice;
			System.out.print("Do you want to add another element in the Array? Y/N");
			while(true)
			{
				tempChoice=z.readLine();
				if(tempChoice.length()==1)
				{
					ch=tempChoice.charAt(0);
					break;
				}
				else
				{
					System.out.println("Invalid choice. Enter the choice again");
				}
			}
			if(ch=='Y')
			{
				
