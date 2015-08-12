/*I am trying to generate the following kind of error
Method uses the same code for two switch clauses (DB_DUPLICATE_SWITCH_CLAUSES)
This method uses the same code to implement two clauses of a switch statement. This could be a case of duplicate code, but it might also indicate a coding mistake. */
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
				 break;
			case 'D':
			case 'E':
			case 'F':System.out.println("Low grade");
				 success = 0;
				 break;
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
