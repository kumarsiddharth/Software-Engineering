/*This will contain  the following type of erro:
BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)*/
import java.io.*;
class MainsClass
{
	public static void main(String args[])throws IOException, Exception
	{
		System.out.println("Printing the two's powers");
		for(int i=0;i<=32;i++)//see an integer cannot be shifted by 32 bit
		{
			int value=1<<i;
			System.out.println("2's power:"+i+"2's value:"+value);
		}
	}
}
