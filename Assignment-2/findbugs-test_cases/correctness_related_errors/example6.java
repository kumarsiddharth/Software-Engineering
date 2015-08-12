/*I am trying to generate a dead store
/*In computer programming, a local variable that is assigned a value but is not read by any subsequent instruction is referred to as a dead store. Dead stores waste processor time and memory, and may be detected through the use of static program analysis.*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class DeadStoreExample 
{
 	public static void main(String[] args)
 	{
  		List<String> list = new ArrayList<String>(); // This is a Dead Store, as the ArrayList is never read. 
   		list = getList();
   		System.out.println(list);
 	}
	private static List<String> getList() 
	{
	   return new ArrayList<String>(Arrays.asList("Hello"));
	}
}
