/*I am trying to generate the following type of error
DMI: Bad constant value for month (DMI_BAD_MONTH)
This code passes a constant month value outside the expected range of 0..11 to a method. 
*/
import java.util.*;
import java.io.*;
class MainsClass
{
	public static void main(String args[])throws IOException,Exception
	{	// Get the year, month, day, hour, minute, second
	 	Calendar cal1 =Calendar.getInstance();;
      		// You cannot use Date class to extract individual Date fields
      		int year = cal1.get(Calendar.YEAR);
      		int month = cal1.get(Calendar.MONTH);      // 0 to 11
      		int day = cal1.get(Calendar.DAY_OF_MONTH);
      		int hour = cal1.get(Calendar.HOUR_OF_DAY);
      		int minute = cal1.get(Calendar.MINUTE);
      		int second = cal1.get(Calendar.SECOND);
      		System.out.printf("Now is %4d/%02d/%02d %02d:%02d:%02d\n",year, month+1, day, hour, minute, second);
		System.out.println("Creating a new date");
		Calendar cal2=Calendar.getInstance();
		cal2.set(2040,13,30);
		Date newDate=cal2.getTime();
		System.out.println(newDate.toString());
		   
	}
}
