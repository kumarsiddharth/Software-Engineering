/*I am trying to generate the following type of error
Dead store to local variable (DLS_DEAD_LOCAL_STORE)

This instruction assigns a value to a local variable, but the value is not read or used in any subsequent instruction. Often, this indicates an error, because the value computed is never used.

Note that Sun's javac compiler often generates dead stores for final local variables. Because FindBugs is a bytecode-based tool, there is no easy way to eliminate these false positives. 
*/
import java.io.*;
class Mainsclass
{
	static int noOfMinutes(int hr)
	{
		int seconds=0;
		return hr*60;
	}
	public static void main(String args[])throws IOException
	{
		int hr=12;
		minutes=noOfMinutes(hr);
		System.out.println("The number of minutes:"+minutes);
	}
} 
