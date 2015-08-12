/*I am trying to generate the following error:
SF: Switch statement found where one case falls through to the next case (SF_SWITCH_FALLTHROUGH)
This method contains a switch statement where one case branch will fall through to the next case. Usually you need to end this case with a break or return.*/
import java.io.*;
class SwitchCaseExample 
{
	public static void main(String[] args) 
	{
		grading('A');
	        grading('C');
		grading('E');
	        grading('G');
		
	}
	public static void grading(char grade) 
	{
		int success;
		switch(grade)
		{
			case 'A':System.out.println("Excellent grade");
	            		 success = 1;
			case 'B':System.out.println("Excellent grade");
	            		 success = 1;
			case 'C':System.out.println("Good grade");
				 success = 1;
			case 'D':
			case 'E':
			case 'F':System.out.println("Low grade");
				 success = 0;
			 default: System.out.println("Invalid grade");
			  	  success = -1;
	  	            	  break;
	  	}
		passTheCourse(success);
	}
	public static void passTheCourse(int success)
	{
	        switch (success) 
	        {
		        case -1:System.out.println("No result");
	            		break;
	        	case 0:System.out.println("Final result: Fail");
	            		break;
		        case 1:System.out.println("Final result: Success");
		               break;
	        	default:System.out.println("Unknown result");
	            		break;
		}
	}
}
