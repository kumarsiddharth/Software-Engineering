import java.io.*;
class stringprogram
{
	public static char touppercase(char c)
	{
		if(c>=97&&c<=122)
		{
			return (char)((int)c-32);
		}
		else
		{
			return c;
		}
	}
	
	public static void main(String args[])throws IOException
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a string:");
		String input,output="";
		input=z.readLine();
		for(int i=0;i<input.length();i++)
		{
			if(i==0)//that means first character of the first word
			{
				output+=touppercase(input.charAt(0));
			}
			else
			{
				if(input.charAt(i-1)==' ')
				{
					output+=touppercase(input.charAt(i));
				}
				else
				{
					output+=input.charAt(i);
				}
			}
		}
		for(int i=0;i<input.length();i++)
		{
			if(i==0)//that means first character of the first word
			{
				System.out.println(output.charAt(0));
			}
			else
			{
				if(input.charAt(i-1)==' ')
				{
					System.out.println(output.charAt(i));
				}

			}
		}
	}
}
