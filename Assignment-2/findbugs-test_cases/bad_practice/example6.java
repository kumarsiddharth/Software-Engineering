/*trying to generate this kind of error:
Bad practice - Method might ignore exception
findbugs : DE_MIGHT_IGNORE

This method might ignore an exception.  In general, exceptions should be handled or reported in some way, or they should be thrown out of the method.
*/
import java.util.Arrays;
//we will illustrate the use of default sort function of java
class MainsClass
{
	public static void main(String args[])
	{
		int arr[]={2,1,6,9,4};
		System.out.println("Printing the array before sorting");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		for(int i=0;i<=5;i++)//this this will throw OutofBound exception but the method does not throw it
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
